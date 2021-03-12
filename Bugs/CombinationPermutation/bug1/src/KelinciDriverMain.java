     import java.io.FileInputStream;
     import java.io.File;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     import edu.cmu.sv.kelinci.Kelinci;
     import edu.cmu.sv.kelinci.Mem;

     public class KelinciDriverMain {	 
    	 private static String address ="/home/amirfarhad/Desktop/ProgramAnalysis/codes/Kelinci/JMLKelinci/JMLKelinci/CombinationPermutation/jml";
    	 public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int n = 0;
		int r = 0;
		int changeToBoolean = 0;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				n = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				r = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				changeToBoolean = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");
			

		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		boolean flag = (changeToBoolean%2 == 0); 
		
		
		String _n = String.valueOf(n);
		String _r = String.valueOf(r);
		String _flag = String.valueOf(flag);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		//driverArg = "JMLDriver " + _size + " >log.txt 2>&1";
		driverArg = "JMLDriver " + _n + " " + _r + " " + _flag;
		
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
			CombinationPermutation p = new CombinationPermutation();
			p.select(n, r, flag);	
		}
      }

}
