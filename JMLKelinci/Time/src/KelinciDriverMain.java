     import java.io.File;    
     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;

     public class KelinciDriverMain {	 
         private static String address ="~/jml";
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

		boolean precondition = RunRAC(constructor, select, hour, minute, second, start_h, start_m, start_s, stop_h, stop_m, stop_s);

		if (precondition) {
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

	 public static boolean RunRAC(int constructor, int select, int hour, int minute, int second, int start_h, int start_m, int start_s, int stop_h, int stop_m, int stop_s) {
	     
		String _constructor = String.valueOf(constructor);
		String _select = String.valueOf(select);
		String _hour = String.valueOf(hour);
		String _minute = String.valueOf(minute);
		String _second = String.valueOf(second);
		String _start_h = String.valueOf(start_h);
		String _start_m = String.valueOf(start_m);
		String _start_s = String.valueOf(start_s);
		String _stop_h = String.valueOf(stop_h);
		String _stop_m = String.valueOf(stop_m);
		String _stop_s = String.valueOf(stop_s);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";
		driverArg = "JMLDriver " + _constructor + " " + _select + " " + _hour + " " + _minute + " " + _second + " " + _start_h + " " + _start_m + " " + _start_s + " " + _stop_h + " " + _stop_m + " " + _stop_s; 
		
		builderProg.command("sh", "-c", "runrac " + driverArg);
		
		builderProg.directory(new File(address));
		Process process = null;
		boolean result = false;
		try {
			process = builderProg.start();
			process.waitFor();
			result = process.exitValue() == 0;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		return result;
         }   
     }
