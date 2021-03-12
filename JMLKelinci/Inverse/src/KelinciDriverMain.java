     import java.io.File;
     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;

     public class KelinciDriverMain {	 
         private static String address ="~/jml";
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int range = 100;
		int arraySize1 = 20;
		int arraySize2 = 20;
		int array1[];
		int array2[];
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1)
				arraySize1 = ByteBuffer.wrap(bytes).getInt();	
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1)
				arraySize2 = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			arraySize1 = arraySize1%range;  // This is not for Specification. "arraySize%range" is for memory limitation of the System.
			arraySize2 = arraySize2%range;  // This is not for Specification. "arraySize%range" is for memory limitation of the System.

			array1 = new int[arraySize1]; 
			array2 = new int[arraySize2];
			for (int i = 0; i <arraySize1; i++) { 			
				if (fis.read(bytes) != -1)				
					array1[i] = ByteBuffer.wrap(bytes).getInt();
				else
					throw new RuntimeException("too less data");
			}
			
			for (int i = 0; i <arraySize2; i++) {			
				if (fis.read(bytes) != -1)				
					array2[i] = ByteBuffer.wrap(bytes).getInt();
				else
					throw new RuntimeException("too less data");
			}	

			boolean precondition = RunRAC(array1, array2);
		
			if (precondition) {
				Inverse p = new Inverse();
               			p.Inverse(array1, array2);		
	       		}	 					
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
	 }

	 public static boolean RunRAC(int[] arr1, int[] arr2) {
		String arrLength1 = String.valueOf(arr1.length);
		String arrLength2 = String.valueOf(arr2.length);
	     
		String[] strs = new String[arr1.length];	
		String arrArg1 = "";

        	for (int i = 0; i < arr1.length; i++) {
            		strs[i] = String.valueOf(arr1[i]);
       		}

		if (arr1.length != 0) {
			arrArg1 = strs[0];
        		for (int i = 1; i < strs.length; i++) {
            			arrArg1 += " " + strs[i];
       			}
		}

		String[] _strs = new String[arr2.length];	
		String arrArg2 = "";

        	for (int i = 0; i < arr2.length; i++) {
            		_strs[i] = String.valueOf(arr2[i]);
       		}

		if (arr2.length != 0) {
			arrArg2 = _strs[0];
        		for (int i = 1; i < _strs.length; i++) {
            			arrArg2 += " " + _strs[i];
       			}
		}

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";
		driverArg = "JMLDriver " + arrLength1 + " " + arrLength2 + " " + arrArg1 + " " + arrArg2;
		
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
			System.err.println("Error in the RunRac method");
		}
		return result;
     	 }
     }
