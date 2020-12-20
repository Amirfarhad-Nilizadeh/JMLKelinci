     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int second = 0;
		int minute = 0;
		int hour = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		int select = 0;
		int constructor = 0;

		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1)
				second = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1)
				minute = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");	

			if (fis.read(bytes) != -1)
				hour = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");		

			if (fis.read(bytes) != -1)
				start_s = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1)
				start_m = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");	

			if (fis.read(bytes) != -1)
				start_h = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");	
			
			if (fis.read(bytes) != -1)
				stop_s = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1)
				stop_m = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");	

			if (fis.read(bytes) != -1)
				stop_h = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1)
				select = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");	

			if (fis.read(bytes) != -1)
				constructor = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");
	
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		constructor %= 2;

		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);

		if (constructor == 0) {
			Time t = new Time();
			t.timeOptions(start, stop, select);
		} else {
			Time _t = new Time(hour, minute, second);
			_t.timeOptions(start, stop, select);
	        }		 
	 }
     }
