     import java.io.File;
     import java.io.FileInputStream;
     import java.util.ArrayList;
     import java.util.List;
     import java.io.IOException;
     import java.nio.ByteBuffer;

     public class KelinciDriverMain {	
         private static String address ="~/jml"; 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		try (FileInputStream fis = new FileInputStream(args[0])) {
		
			 byte[] bytes = new byte[Integer.BYTES];
			 int option = 0;
 			 int _char = 1000;

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

			if (precondition) {
				Alphabet a = new Alphabet((char)_char);
				a.driver(option);	
			}	
			
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
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
			result = process.exitValue() == 0;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		return result;
         }
     }
