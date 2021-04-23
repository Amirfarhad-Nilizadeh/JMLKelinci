    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                	FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
			int option = 0;
 			int _char = 1000;
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				option = ByteBuffer.wrap(bytes).getInt();  
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1)
				_char = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

                	_char = _char % 65536;
			if (_char < 0)
				_char = -_char;

			System.out.println("Option is: " + option + " intOfChar is : " +  _char  + " charactet is : " + (char)_char); 
			Alphabet a = new Alphabet((char)_char);
			System.out.println(a.driver(option));	  
      
                	fis.close();    
              } catch(Exception e) { System.out.println(e); }    
         }    
    }  
