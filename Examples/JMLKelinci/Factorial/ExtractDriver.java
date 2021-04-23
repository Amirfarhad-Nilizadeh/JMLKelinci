    import java.io.FileInputStream;
    import java.io.File;
    import java.io.IOException;        
    import java.nio.ByteBuffer;
    import java.util.Date;
    public class ExtractDriver {  
	 private static String address = "/Path to the jml directory that checks Factorial preconditions/Factorial/jml";
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int num = 0;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) {
			num = (ByteBuffer.wrap(bytes).getInt());
		}
		
		boolean precondition = RunRAC(num);
		System.out.println("Number is: " + num + " precondition " + precondition); 

		if (precondition) {
			Factorial f = new Factorial();
			System.out.println(" Result : " + f.factorial(num));
		}
			 
               fis.close();    
              } catch(Exception e) { System.out.println(e); }  
         } 

	 public static boolean RunRAC(int num) {
		String _num = String.valueOf(num);
		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + _num;
		
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
