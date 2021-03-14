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
		int arraySize = 10;
		int key = 0;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
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

			arraySize%=range; // This is not for Specification. "arraySize%range" is for memory limitation of the System.

			int array[] = new int[arraySize]; 

			for (int i = 0; i < arraySize;i++){			
				if (fis.read(bytes) != -1)				
					array[i] = ByteBuffer.wrap(bytes).getInt();
				else
					throw new RuntimeException("too less data");				
			}

			FIND_FIRST_IN_SORTED f = new FIND_FIRST_IN_SORTED();
               		f.find_first_in_sorted(array, key);		

		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
	 }
     }
