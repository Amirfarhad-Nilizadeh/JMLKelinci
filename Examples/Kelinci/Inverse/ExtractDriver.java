    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                FileInputStream fis = new FileInputStream("id:000000,orig:example.txt");    
		int probability = 1; // we need two different kinds of generated tests by kelinci 
		int range = 100;
		int arraySize1 = 20;
		int arraySize2 = 20;
		int array1[];
		int array2[];
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1)
			arraySize1 = ByteBuffer.wrap(bytes).getInt();	
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1)
			arraySize2 = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		arraySize1 = arraySize1%range; // This is not for Specification. "arraySize%range" is for memory limitation of System.
		arraySize2 = arraySize2%range; // This is not for Specification. "arraySize%range" is for memory limitation of System.
		
		array1 = new int[arraySize1]; 
		array2 = new int[arraySize2];
		for (int i = 0; i <arraySize1; i++) {			
			if (fis.read(bytes) != -1)				
				array1[i] = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");
		}
			
		for (int i = 0; i < arraySize2; i++) {			
			if (fis.read(bytes) != -1)				
				array2[i] = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");
		}
			
		System.out.println(" Probability " + probability + " arraySize1: " + arraySize1 + " arraySize2: " + arraySize2); 

		System.out.print("arraySize1 = {");

		for (int i = 0; i < arraySize1-1; i++)
			System.out.print(array1[i] + ", ");
		
		if (arraySize1 != 0)
			System.out.print(array1[arraySize1-1]);
	
		System.out.println("}");

		System.out.print("arraySize2 = {");

		for (int i = 0; i < arraySize2-1; i++)
			System.out.print(array2[i] + ", ");
		
		if (arraySize2 != 0)
			System.out.print(array2[arraySize2-1]);
	
		System.out.println("}");
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
          }    
      }  
