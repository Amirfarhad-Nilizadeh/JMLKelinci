import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class KelinciDriverMain {	 
     public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}
		
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0;

		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] shortBytes = new byte[Short.BYTES];
			byte[] intBytes = new byte[Integer.BYTES];
			byte[] longBytes = new byte[Long.BYTES];

			if (fis.read(shortBytes) != -1)
				shortNum = ByteBuffer.wrap(shortBytes).getShort();
			else
				throw new RuntimeException("too less data");

			if (fis.read(intBytes) != -1) 
				intNum = ByteBuffer.wrap(intBytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(longBytes) != -1) 
				longNum = ByteBuffer.wrap(longBytes).getLong();
			else
				throw new RuntimeException("too less data");
			

		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		AbsoluteDriver p = new AbsoluteDriver(shortNum, intNum, longNum);
                p.driver();		 
     }
}
