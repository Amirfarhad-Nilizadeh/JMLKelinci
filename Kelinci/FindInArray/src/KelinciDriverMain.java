     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		boolean Specification = true;
		int constructor = 0;
		int arrayRange = 400; 
		int arraySize = 300;
		int key = 1000;

		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) {
				constructor = ByteBuffer.wrap(bytes).getInt();
			}

			if (fis.read(bytes) != -1) {
				arraySize = ByteBuffer.wrap(bytes).getInt();
			}

			if (fis.read(bytes) != -1) {
				key = ByteBuffer.wrap(bytes).getInt();
			}

			arraySize%=arrayRange; // This is not for Specification. "arraySize%range" is for memory limitation of System.
			constructor %= 2;

			int array[] = new int[arraySize];

			for (int i = 0; i < arraySize; i++){  
					if (fis.read(bytes) != -1) {  
						array[i] = ByteBuffer.wrap(bytes).getInt();
					}						
				}

			if (constructor == 0) {
				FindInArray p = new FindInArray(array);
				p.isMoreThanOneKey();
			} else {
				FindInArray p1 = new FindInArray(array, key);
				p1.isMoreThanOneKey();
			}
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
	 }
     }
