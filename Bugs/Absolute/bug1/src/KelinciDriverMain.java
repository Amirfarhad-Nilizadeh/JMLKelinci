     import java.io.FileInputStream;
     import java.io.File;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     import edu.cmu.sv.kelinci.Kelinci;
     import edu.cmu.sv.kelinci.Mem;

     public class KelinciDriverMain {	 
    	 private static String address ="/home/amirfarhad/Desktop/ProgramAnalysis/codes/Kelinci/JMLKelinci/firstNonTrivial/Absolute/bug1/jml";
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

		
		
		String _shortNum = String.valueOf(shortNum);
		String _intNum = String.valueOf(intNum);
		String _longNum = String.valueOf(longNum);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		//driverArg = "JMLDriver " + _size + " >log.txt 2>&1";
		driverArg = "JMLDriver " + _shortNum + " " + _intNum + " " + _longNum;
		
		builderProg.command("sh", "-c", "runrac " + driverArg);
		
		builderProg.directory(new File(address));
		Process process = null;
		boolean precondition = false;
		try {
			process = builderProg.start();
			process.waitFor();
			precondition = process.exitValue() == 0;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		

		if (precondition) {
			AbsoluteDriver d = new AbsoluteDriver(shortNum, intNum, longNum);
			d.driver();	
		}
      }
}
