    import java.io.File;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
	 private static String address ="/Path to the jml directory that checks Inverse preconditions/Inverse/jml";
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int probability = 1; // we need two different kinds of generated tests by kelinci 
		int range = 100;
		int arraySize1 = 20;
		int arraySize2 = 20;
		int array1[];
		int array2[];
		byte[] bytes = new byte[Integer.BYTES];
		if (fis.read(bytes) != -1)
			arraySize1 = ByteBuffer.wrap(bytes).getInt();	
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1)
			arraySize2 = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		arraySize1 = arraySize1%range;  // This is not for Specification. "arraySize%range" is for memory limitation of System.
		arraySize2 = arraySize2%range;  // This is not for Specification. "arraySize%range" is for memory limitation of System.
		
		array1 = new int[arraySize1]; 
		array2 = new int[arraySize2];
		for (int i = 0; i <arraySize1; i++) {			
			if (fis.read(bytes) != -1)				
				array1[i] = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");
			}
			
		for (int i = 0; i < arraySize2; i++) {			
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

		System.out.println(" precondition : " + precondition + " arraySize1 : " + arraySize1 + " arraySize2 : " + arraySize2); 
		System.out.print("arraySize1 = {");

		for (int i = 0; i < arraySize1-1; i++)
			System.out.print(array1[i] + ", ");
		
		if (arraySize1 != 0)
			System.out.print(array1[arraySize1-1]);
	
		System.out.println("}");

		System.out.print("arraySize2 = {");

		for (int i = 0; i < arraySize2-1; i++)
			System.out.print(array2[i] + ", ");
		
		if (arraySize2 != 0)
			System.out.print(array2[arraySize2-1]);
	
		System.out.println("}");
      
      
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
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
