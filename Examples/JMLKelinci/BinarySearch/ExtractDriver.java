    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver { 
	 private static String address ="/Path to the jml directory that checks BinarySearch preconditions/BinarySearch/jml"; 
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int range = 200;
		int arraySize = 20;
		int key = 0;
		int i;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			arraySize = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			key = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		arraySize%=range; // This is not for Specification. "arraySize%range" is for memory limitation of System.

		if (arraySize < 0)
			arraySize = -arraySize;

		int array[] = new int[arraySize]; 

		for (i = 0; i < arraySize;i++) {			
			if (fis.read(bytes) != -1)				
				array[i] = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");				
		}

		System.out.println("/**********************************************************************************************/");
		System.out.print("{");

		for(i = 0; i < arraySize-1; i++)
			System.out.print(array[i] + ", ");
		
		if (arraySize != 0)
			System.out.print(array[arraySize-1]);
	
		System.out.println("}");	  
		System.out.println("/**********************************************************************************************/");	
				
		System.out.println(" arraySize: " + arraySize + " key: " + key);
 
		boolean precondition = RunRAC(array, key);
		
		if (precondition) {
			BinarySearch p = new BinarySearch();
               		p.Binary(array, key);	
	         }
      
		System.out.println("precondition " + precondition + " arraySize: " + arraySize + " key: " + key);
                fis.close();    
              } catch(Exception e) {System.out.println(e);}    
         }  

	 public static boolean RunRAC(int []arr, int key) {
	     
		String _key = String.valueOf(key);
		String[] strs = new String[arr.length];

        	for (int i = 0; i < arr.length; i++) {
            		strs[i] = String.valueOf(arr[i]);
       		}

		String arrArg = strs[0];
        	for (int i = 1; i < strs.length; i++) {
            		arrArg += " " + strs[i];
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
