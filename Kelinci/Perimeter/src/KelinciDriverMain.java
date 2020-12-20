     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		boolean Specification = true;
		int select = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		short shortNum = 0;
		long longNum = 0;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];
			byte[] ShortBytes = new byte[Short.BYTES];
			byte[] LongBytes = new byte[Long.BYTES];

			if (fis.read(bytes) != -1) 
				select = ByteBuffer.wrap(bytes).getInt();

			if (fis.read(bytes) != -1) 
				num1 = ByteBuffer.wrap(bytes).getInt();

			if (fis.read(bytes) != -1) 
				num2 = ByteBuffer.wrap(bytes).getInt();
			
			if (fis.read(bytes) != -1) 
				num3 = ByteBuffer.wrap(bytes).getInt();

			if (fis.read(bytes) != -1) 
				num4 = ByteBuffer.wrap(bytes).getInt();


			if (fis.read(ShortBytes) != -1) 
				shortNum = ByteBuffer.wrap(ShortBytes).getShort();

			if (fis.read(LongBytes) != -1) 
				longNum = ByteBuffer.wrap(LongBytes).getLong();
			
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		PerimeterDriver p = new PerimeterDriver();
		p.driver(select, num1, num2, num3, num4, shortNum, longNum);	 
	 }
     }
