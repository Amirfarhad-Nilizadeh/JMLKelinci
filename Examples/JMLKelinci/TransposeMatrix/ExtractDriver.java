    import java.io.File;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {
	 private static String address ="/Path to the jml directory that checks TransposeMatrix preconditions/TransposeMatrix/jml";  
         public static void main(String args[]){    
              try {    
                FileInputStream fis = new FileInputStream("id:000000,orig:example.txt");    
		int range = 80;
		int arraySize1 = 20;
		int arraySize2 = 20;
		byte[] bytes = new byte[Integer.BYTES];
		if (fis.read(bytes) != -1) 
			arraySize1 = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");
	
		if (fis.read(bytes) != -1)
			arraySize2 = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		arraySize1%=range; // This is not for Specification. "arraySize1%range" is for memory limitation of System.
		arraySize2%=range; // This is not for Specification. "arraySize2%range" is for memory limitation of System.

		int matrix[][] = new int[arraySize1][arraySize2]; 

		for (int i = 0; i < arraySize1; i++) { 
			for (int j = 0; j < arraySize2; j++) {
				if (fis.read(bytes) != -1) 
					matrix[i][j] = ByteBuffer.wrap(bytes).getInt();					
				else
					throw new RuntimeException("too less data");
			}
		}
		System.out.println("/**********************************************************************************************/");
		System.out.println("arraySize1: " + arraySize1 + " arraySize2: " + arraySize2);

		System.out.print("{");
		for (int i = 0; i < arraySize1; i++) {
			System.out.print("{");
			for (int j = 0; j < arraySize2; j++) {
				System.out.print(matrix[i][j]);
				if (j != arraySize2-1)
					System.out.print(", ");
			}
			if (i != arraySize1-1)
				System.out.print("},");
			else
				System.out.print("}");
		}

		System.out.print("}");
		System.out.println("/**********************************************************************************************/");
		boolean precondition = RunRAC(matrix);
	
		if (precondition) {
			TransposeMatrix p = new TransposeMatrix();
                	p.transposeMat(matrix);			
	        }
		System.out.println(" precondition : " + precondition);		
                fis.close();    
              } catch(Exception e){System.out.println(e); }    
         }  
	 public static boolean RunRAC(int[][] mat) {
		String size1 = String.valueOf(mat.length);
		String size2 = String.valueOf(mat[0].length);
	     
		String[] strs = new String[(mat.length)*(mat[0].length)];	
		String matArg = "";
		int k = 0;
        	for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
            			strs[k] = String.valueOf(mat[i][j]);
				k++;
			}
       		}

		if (mat.length != 0) {
			matArg = strs[0];
        		for (int i = 1; i < strs.length; i++) {
            			matArg += " " + strs[i];
       			}
		}

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + size1 + " " + size2 + " " + matArg;
		
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
