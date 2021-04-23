    import java.io.File;
    import java.io.FileInputStream;  
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
	 private static String address ="/Path to the jml directory that checks Alphabet preconditions/Alphabet/jml";
         public static void main(String args[]) {    
              try {    
                	FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
			int option = 0;
 			int _char = 1000;
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				option = ByteBuffer.wrap(bytes).getInt();  
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1)
				_char = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

                	_char = _char % 65536;
			if (_char < 0)
				_char = -_char;
			boolean precondition = RunRAC(option, _char);

			System.out.println("precondition : " + precondition + " Option is: " + option + " intOfChar is : " +  _char  + " charactet is : " + (char)_char); 
				
			if (precondition) {
				Alphabet a = new Alphabet((char)_char);
				a.driver(option);	
			}		  
      
                	fis.close();    
              } catch(Exception e) { System.out.println(e); }    
         } 
	 public static boolean RunRAC(int option, int _char) {
		String _option = String.valueOf(option);
		String _num = String.valueOf(_char);
	
		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + _option + " " + _num;
		
		builderProg.command("sh", "-c", "runrac " + driverArg);
		
		builderProg.directory(new File(address));
		Process process = null;
		boolean result = false;
		try {
			process = builderProg.start();
			process.waitFor();
			result = process.exitValue() == 0 ? true : false;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		return result;
         }   
    }  
