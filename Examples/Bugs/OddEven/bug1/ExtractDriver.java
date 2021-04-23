    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int num = 0;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			num = ByteBuffer.wrap(bytes).getInt();
			System.out.println("Selected number is: " + num);  
                	fis.close();    
              } catch (Exception e) { System.out.println(e);}    
          }    
      }
