    import java.io.File;   
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
	 private static String address ="/Path to the jml directory that checks FIND_FIRST_IN_SORTED preconditions/FIND_FIRST_IN_SORTED/jml"; 
         public static void main(String args[]){    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int range = 100;
		int arraySize = 10;
		int key = 0;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) {
			arraySize = ByteBuffer.wrap(bytes).getInt();
		}	
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) {
			key = ByteBuffer.wrap(bytes).getInt();
		}
		else
			throw new RuntimeException("too less data");

		arraySize%=range; // This is not for Specification. "arraySize%range" is for memory limitation of System. 

		System.out.println("key : " + key + " Size : " + arraySize );  

		int array[] = new int[arraySize];

		for (int i = 0; i < arraySize;i++) {			
			if (fis.read(bytes) != -1)				
				array[i] = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");				
		}

		System.out.println("/**********************************************************************************************/");
		System.out.print("{");

		for (int i = 0; i < arraySize-1; i++)
			System.out.print(array[i] + ", ");
		
		if (arraySize != 0)
			System.out.print(array[arraySize-1]);
	
		System.out.println("}");	

		System.out.println("key : " + key);  
			  
		System.out.println("/**********************************************************************************************/");	
               			 	
      		boolean precondition = RunRAC(array, key);
		System.out.println("precondition : " + precondition);
		if (precondition) {
			FIND_FIRST_IN_SORTED f = new FIND_FIRST_IN_SORTED();
               		System.out.println("Location of key is here " + f.find_first_in_sorted(array, key));
	         }

                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
             } 
	     public static boolean RunRAC(int[] arr, int key) {
		String _key = String.valueOf(key);
		String[] strs = new String[arr.length];	
		String arrArg = "";

        	for (int i = 0; i < arr.length; i++) {
            		strs[i] = String.valueOf(arr[i]);
       		}

		if (arr.length != 0) {
			arrArg = strs[0];
        		for (int i = 1; i < strs.length; i++) {
            			arrArg += " " + strs[i];
       			}
		}

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + arrArg + " " + _key;
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
