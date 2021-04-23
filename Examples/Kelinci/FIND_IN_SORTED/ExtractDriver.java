    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]){    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int range = 300;
		int arraySize = 10;
		int key = 0;
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

		arraySize%=range; // This is not for Specification. "arraySize%range" is for memory limitation of System.

		int array[] = new int[arraySize]; 

		System.out.println("key : " + key + " Size : " + arraySize );  

		for(int i = 0; i < arraySize;i++){			
			if (fis.read(bytes) != -1)				
				array[i] = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");				
		}
	
		System.out.println("/**********************************************************************************************/");
		System.out.print("{");

		for (int i = 0; i < arraySize-1; i++)
			System.out.print(array[i] + ", ");
		
		if (arraySize != 0)
			System.out.print(array[arraySize-1]);
	
		System.out.println("}");	

		System.out.println("key : " + key);  
			  
		System.out.println("/**********************************************************************************************/");	

		FIND_IN_SORTED find = new FIND_IN_SORTED();
               	System.out.println("Location of key is here " + find.find_in_sorted(array, key));		
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
          }    
      }  
