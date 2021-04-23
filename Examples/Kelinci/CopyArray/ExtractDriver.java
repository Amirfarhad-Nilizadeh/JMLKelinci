    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int range = 2000;
		int arraySize1 = 20;
		int arraySize2 = 20;
		int iEnd = 0;
		int iBegin = 0;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) {
			arraySize1 = ByteBuffer.wrap(bytes).getInt();
		}
	
		if (fis.read(bytes) != -1) {
			arraySize2 = ByteBuffer.wrap(bytes).getInt();
		}	

		if (fis.read(bytes) != -1) {
			iBegin = ByteBuffer.wrap(bytes).getInt();
		}

		if (fis.read(bytes) != -1) {
			iEnd = ByteBuffer.wrap(bytes).getInt();
		}

		arraySize1 = arraySize1%range; // This is not for Specification. "arraySize%range" is for memory limitation of System.
		arraySize2 = arraySize2%range; // This is not for Specification. "arraySize%range" is for memory limitation of System.
		
		int array1[] = new int[arraySize1]; 
		int array2[] = new int[arraySize2];

		for (int i = 0; i < arraySize1; i++) {			
			if (fis.read(bytes) != -1) {				
				array1[i] = ByteBuffer.wrap(bytes).getInt();
			}
			else
				throw new RuntimeException("too less data");
		}
		
		for (int i = 0; i < arraySize2; i++) {			
			if (fis.read(bytes) != -1) {				
				array2[i] = ByteBuffer.wrap(bytes).getInt();
			}
			else
				throw new RuntimeException("too less data");	
		}

		System.out.println(" arraySize1 : " + arraySize1 + " arraySize2 : " + arraySize2 + " iBegin: " + iBegin + " iEnd: " + iEnd); 

		System.out.print("array1 : {");

		for (int i = 0; i < arraySize1-1; i++)
			System.out.print(array1[i] + ", ");
		
		if (arraySize1 != 0)
			System.out.print(array1[arraySize1-1]);
	
		System.out.println("}");

		System.out.println();

		System.out.print("array 2: {");

		for (int i = 0; i < arraySize2-1; i++)
			System.out.print(array2[i] + ", ");
		
		if (arraySize2 != 0)
			System.out.print(array2[arraySize2-1]);
	
		System.out.println("}");

		CopyArray copy = new CopyArray();
               	copy.CopyArray(array1, iBegin, iEnd, array2);	

		System.out.print("Result : {");

		for (int i = 0; i < arraySize2-1; i++)
			System.out.print(array2[i] + ", ");
		
		if (arraySize2 != 0)
			System.out.print(array2[arraySize2-1]);
	
		System.out.println("}");
			  
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
           }    
      }  
