     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int range = 80;
		int arraySize1 = 20;
		int arraySize2 = 20;
		
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

			arraySize1%=range; // This is not for Specification. "arraySize1%range" is for memory limitation of the System.
			arraySize2%=range; // This is not for Specification. "arraySize2%range" is for memory limitation of the System.

			int matrix[][] = new int[arraySize1][arraySize2]; 

			for (int i = 0; i < arraySize1; i++){ 
				for (int j = 0; j < arraySize2; j++){
					if (fis.read(bytes) != -1) 
						matrix[i][j] = ByteBuffer.wrap(bytes).getInt();					
					else
						throw new RuntimeException("too less data");
				}
			}
			
			TransposeMatrix p = new TransposeMatrix();
                	p.transposeMat(matrix);		
			
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}	 
	 }
     }
