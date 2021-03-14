     import java.io.FileInputStream;
     import java.io.File;
     import java.io.IOException;
     import java.nio.ByteBuffer;

     public class KelinciDriverMain {	 
    	 private static String JMLAddress ="jml";
    	 public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		short shortNum = 0;
		int intNum = 0;
		long longNum = 0;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] shortBytes = new byte[Short.BYTES];
			byte[] intBytes = new byte[Integer.BYTES];
			byte[] longBytes = new byte[Long.BYTES];

			if (fis.read(shortBytes) != -1)
				shortNum = ByteBuffer.wrap(shortBytes).getShort();
			else
				throw new RuntimeException("too less data");

			if (fis.read(intBytes) != -1) 
				intNum = ByteBuffer.wrap(intBytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(longBytes) != -1) 
				longNum = ByteBuffer.wrap(longBytes).getLong();
			else
				throw new RuntimeException("too less data");
			
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		boolean precondition = RunRAC(shortNum, intNum, longNum);

		if (precondition) {
			AbsoluteDriver d = new AbsoluteDriver(shortNum, intNum, longNum);
			d.driver();	
		}
         }

         public static boolean RunRAC(short shortNum, int intNum, long longNum) {
	     
		String _shortNum = String.valueOf(shortNum);
		String _intNum = String.valueOf(intNum);
		String _longNum = String.valueOf(longNum);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";
		driverArg = "JMLDriver " + _shortNum + " " + _intNum + " " + _longNum;
		
		builderProg.command("sh", "-c", "runrac " + driverArg);
		
		builderProg.directory(new File(JMLAddress));
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
