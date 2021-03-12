     import java.io.FileInputStream;
     import java.io.File;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     import edu.cmu.sv.kelinci.Kelinci;
     import edu.cmu.sv.kelinci.Mem;

     public class KelinciDriverMain {	 
    	 private static String address ="/home/amirfarhad/Desktop/ProgramAnalysis/codes/Kelinci/JMLKelinci/firstNonTrivial/Fibonacci/bug1/jml";
    	 public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int size = 0;
		int constructor = 0;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				size = (ByteBuffer.wrap(bytes).getInt());
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				constructor = (ByteBuffer.wrap(bytes).getInt());
			else
				throw new RuntimeException("too less data");
		

		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		int select = constructor%5;
		
		boolean precondition = RunRAC(select, size);
		

		if (precondition) {
			if (select == 0) {
				Fibonacci f = new Fibonacci();
				f.fibCompute();
                		f.getFib(1);	
			} else {
  				Fibonacci f = new Fibonacci(size);
				f.fibCompute();
				f.getFib(size-1);
	 		}
		}
      }

      public static boolean RunRAC(int select, int size) {
	     
		String _select = String.valueOf(select);
		String _size = String.valueOf(size);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		//driverArg = "JMLDriver " + _size + " >log.txt 2>&1";
		driverArg = "JMLDriver " + _select + " " + _size;
		
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
