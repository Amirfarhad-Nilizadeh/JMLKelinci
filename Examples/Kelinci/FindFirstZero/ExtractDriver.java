    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]){    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int range = 2000;
		int arraySize = 20;
		int i;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) {
			arraySize = ByteBuffer.wrap(bytes).getInt();
		}

		arraySize%=range; // This is not for Specification. "arraySize%range" is for memory limitation of System.

		int array[] = new int[arraySize];

		for (i = 0; i <arraySize; i++){  
			if (fis.read(bytes) != -1) {  
				array[i] = ByteBuffer.wrap(bytes).getInt();
			}						
		}
			
		System.out.println(" arraySize: " + arraySize); 
				
		System.out.print("{");
		for (i = 0; i < arraySize-1; i++)
			System.out.print(array[i] + ", ");
		
		if (arraySize != 0)
			System.out.print(array[arraySize-1]);
	
		System.out.println("}");	 
			 
                fis.close();    
              } catch (Exception e) { System.out.println(e); }    
          }    
      }  
