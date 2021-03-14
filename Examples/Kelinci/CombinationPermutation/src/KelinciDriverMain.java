     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}
	
		int n = 0;
		int r = 0;
		int changeToBoolean = 0;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				n = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				r = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				changeToBoolean = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");
			
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		boolean flag = (changeToBoolean%2 == 0) ? true : false; 

		CombinationPermutation p = new CombinationPermutation();
		p.select(n, r, flag);		 
	 }
     }
