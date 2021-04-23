    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		boolean Specification = true;
		int constructor = 0;
		int arrayRange = 400; 
		int arraySize = 300;
		int key = 1000;
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

		for (int i = 0; i < arraySize; i++) {  
			if (fis.read(bytes) != -1) {  
				array[i] = ByteBuffer.wrap(bytes).getInt();
			}						
		}
		
		if (constructor == 0) {
			FindInArray p = new FindInArray(array);
			p.isMoreThanOneKey();
			System.out.println( " Constructor: " + constructor+  " arraySize: " + arraySize);
		} else {
			FindInArray p1 = new FindInArray(array, key);
			p1.isMoreThanOneKey();
			System.out.println(" Constructor: " + constructor+  " arraySize: " + arraySize + " Key: " + key);
		}		
		System.out.print("{");

		for (int i = 0; i < arraySize-1; i++)
			System.out.print(array[i] + ", ");
		
		if (arraySize != 0)
			System.out.print(array[arraySize-1]);
	
		System.out.println("}");	 
			  
      
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
          }    
      }  
