     import java.io.FileInputStream;
     import java.util.ArrayList;
     import java.util.List;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		try (FileInputStream fis = new FileInputStream(args[0])) {
		
			 byte[] bytes = new byte[Integer.BYTES];
			 int option = 0;
 			 int _char = 1000;

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
 				
			Alphabet a = new Alphabet((char)_char);
			a.driver(option);

		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}
	 }
     }
