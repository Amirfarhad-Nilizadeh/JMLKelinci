     import java.io.FileInputStream;
     import java.io.File;
     import java.io.IOException;
     import java.nio.ByteBuffer;

     public class KelinciDriverMain {	
     	 private static String address ="~/jml"; 
     	 public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int num = 0;

		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1)
				num = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");				
			

		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		boolean precondition = RunRAC(num);
		
		if (precondition) {
			Even even = new Even();
                	even.isEven(num);
	         }
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
			result = process.exitValue() == 0 ? true : false;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		return result;
     	 }
     }
