    import java.io.FileInputStream;
    import java.io.File;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
	private static String address ="/Path to the jml directory that checks Absolute preconditions/Absolute/jml";
        public static void main(String args[]) {    
              try {    
                	FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
			short shortNum = 0;
			int intNum = 0;
			long longNum = 0;
			byte[] shortBytes = new byte[Short.BYTES];
			byte[] intBytes = new byte[Integer.BYTES];
			byte[] longBytes = new byte[Long.BYTES];

			if (fis.read(shortBytes) != -1) {
				shortNum = ByteBuffer.wrap(shortBytes).getShort();
			}

			if (fis.read(intBytes) != -1) {
				intNum = ByteBuffer.wrap(intBytes).getInt();
			}

			if (fis.read(longBytes) != -1) {
				longNum = ByteBuffer.wrap(longBytes).getLong();
			}
		
			boolean precondition = RunRAC(shortNum, intNum, longNum);
		
			System.out.println("precondition " + precondition + " shortNum: " + shortNum + " intNum: " + intNum + " longNum: " + longNum); 
			if (precondition) {
				AbsoluteDriver d = new AbsoluteDriver(shortNum, intNum, longNum);
				d.driver();	
				System.out.println("sh = " + d.sh);
				System.out.println("int = " + d.i);
				System.out.println("long = " + d.l);
			}			  
                	fis.close();    
              } catch(Exception e) { System.out.println(e); }    
        }
	public static boolean RunRAC(short shortNum, int intNum, long longNum) {
		String _shortNum = String.valueOf(shortNum);
		String _intNum = String.valueOf(intNum);
		String _longNum = String.valueOf(longNum);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + _shortNum + " " + _intNum + " " + _longNum;
		
		builderProg.command("sh", "-c", "runrac " + driverArg);
		
		builderProg.directory(new File(address));
		Process process = null;
		boolean result = false;
		try {
			process = builderProg.start();
			process.waitFor();
			result = process.exitValue() == 0;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		return result;
        }      
    }  
