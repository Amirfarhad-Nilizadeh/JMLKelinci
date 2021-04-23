    import java.io.File;
    import java.io.FileInputStream;      
    import java.nio.ByteBuffer;
    public class ExtractDriver { 
	 private static String address ="/Path to the jml directory that checks CopyArray preconditions/CopyArray/jml";	 
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int range = 2000;
		int arraySize1 = 20;
		int arraySize2 = 20;
		int iEnd = 0;
		int iBegin = 0;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) {
			arraySize1 = ByteBuffer.wrap(bytes).getInt();
		}
	
		if (fis.read(bytes) != -1) {
			arraySize2 = ByteBuffer.wrap(bytes).getInt();
		}	

		if (fis.read(bytes) != -1) {
			iBegin = ByteBuffer.wrap(bytes).getInt();
		}

		if (fis.read(bytes) != -1) {
			iEnd = ByteBuffer.wrap(bytes).getInt();
		}

		arraySize1 = arraySize1%range;// This is not for Specification. "arraySize%range" is for memory limitation of System.
		arraySize2 = arraySize2%range;// This is not for Specification. "arraySize%range" is for memory limitation of System.
			
		int array1[] = new int[arraySize1]; 
		int array2[] = new int[arraySize2];

		for (int i = 0; i < arraySize1; i++) {			
			if (fis.read(bytes) != -1) {				
				array1[i] = ByteBuffer.wrap(bytes).getInt();
			}
			else
				throw new RuntimeException("too less data");
		}
		
		for (int i = 0; i < arraySize2; i++) {			
			if (fis.read(bytes) != -1) {				
				array2[i] = ByteBuffer.wrap(bytes).getInt();
			}
			else
				throw new RuntimeException("too less data");	
		}

		System.out.println(" arraySize1 : " + arraySize1 + " arraySize2 : " + arraySize2 + " iBegin: " + iBegin + " iEnd: " + iEnd); 
		
		boolean precondition = RunRAC(array1, iBegin, iEnd, array2);

		System.out.println(" precondition : " + precondition);

		System.out.print("array1 : {");
		for (int i = 0; i < arraySize1-1; i++)
			System.out.print(array1[i] + ", ");
		
		if (arraySize1 != 0)
			System.out.print(array1[arraySize1-1]);
	
		System.out.println("}");

		System.out.println();


		System.out.print("array 2: {");

		for (int i = 0; i < arraySize2-1; i++)
			System.out.print(array2[i] + ", ");
		
		if (arraySize2 != 0)
			System.out.print(array2[arraySize2-1]);
	
		System.out.println("}");

		CopyArray copy = new CopyArray();
               	copy.CopyArray(array1, iBegin, iEnd, array2);	

		System.out.print("Result : {");

		for (int i = 0; i < arraySize2-1; i++)
			System.out.print(array2[i] + ", ");
		
		if (arraySize2 != 0)
			System.out.print(array2[arraySize2-1]);
	
		System.out.println("}");
			  
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
        }

	public static boolean RunRAC(int[] arr1, int iBegin, int iEnd, int[] arr2) {
		String arrLength1 = String.valueOf(arr1.length);
		String arrLength2 = String.valueOf(arr2.length);

		String _iBegin = String.valueOf(iBegin);
		String _iEnd = String.valueOf(iEnd);
	     
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

		driverArg = "JMLDriver " + _iBegin + " " + _iEnd + " " + arrLength1 + " " + arrLength2 + " " + arrArg1 + " " + arrArg2;
		
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
