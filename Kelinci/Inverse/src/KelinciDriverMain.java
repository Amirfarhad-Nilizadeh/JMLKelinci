     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
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
			
			for (int i = 0; i <arraySize2; i++) {			
				if (fis.read(bytes) != -1)				
					array2[i] = ByteBuffer.wrap(bytes).getInt();
				else
					throw new RuntimeException("too less data");
			}	

			Inverse p = new Inverse();
               		p.Inverse(array1, array2);				

		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
	 }
     }
