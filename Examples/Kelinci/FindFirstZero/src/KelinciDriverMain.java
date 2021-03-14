     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) { 
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int range = 2000;
		int arraySize = 20;
		int i;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) {
				arraySize = ByteBuffer.wrap(bytes).getInt();
			}

			arraySize%=range; // This is not for Specification. "arraySize%range" is for memory limitation of the System.
			int array[] = new int[arraySize];

			for (i = 0; i < arraySize; i++) {  
				if (fis.read(bytes) != -1) {  
					array[i] = ByteBuffer.wrap(bytes).getInt();
				}						
			}

			FindFirstZero find = new FindFirstZero();
               		find.FindFirstZero(array);			
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
	 }
     }
