    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
	 private static String address ="/Path to the jml directory that checks Smallest preconditions/Smallest/jml";
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		boolean Specification = true;
		int range = 3000;
		int arraySize = 20;
		int i;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			arraySize = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");	

		arraySize%=range; // This is not for Specification. "arraySize%range" is for memory limitation of System.

		int array[] = new int[arraySize]; 

		for (i = 0; i < arraySize; i++){  
			if (fis.read(bytes) != -1)
				array[i] = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");						
		}

		System.out.println("/**********************************************************************************************/");
		System.out.print("{");

		for (i = 0; i < arraySize-1; i++)
			System.out.print(array[i] + ", ");
			if (arraySize != 0)
				System.out.print(array[arraySize-1]);
			System.out.println("}");
			System.out.println("/**********************************************************************************************/");
		boolean precondition = RunRAC(array);
		System.out.println("precondition : " + precondition);
			if (precondition) {
				Smallest s = new Smallest();
                		s.Smallest(array);	
	         	}
      
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
             }   
	     public static boolean RunRAC(int[] arr) {
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

		driverArg = "JMLDriver " + arrArg;
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
