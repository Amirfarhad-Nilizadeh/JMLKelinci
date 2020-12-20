     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int num1 = 0;
		int num2 = 0;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				num1 = ByteBuffer.wrap(bytes).getInt();

			if (fis.read(bytes) != -1) 
				num2 = ByteBuffer.wrap(bytes).getInt();	

		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		LCM l = new LCM();
		l.lcm(num1, num2);		
	 }
     }
