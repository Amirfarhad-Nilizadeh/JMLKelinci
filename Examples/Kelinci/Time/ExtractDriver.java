    import java.io.File;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
	 private static String address ="/Path to the jml directory that checks Time preconditions/Time/jml";
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
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
	
		constructor %= 2;
		boolean precondition = RunRAC(constructor, hour, minute, second, start_h, start_m, start_s, stop_h, stop_m, stop_s);
		System.out.println("precondition is : " + precondition); 
		System.out.println("constructor : " + constructor + ", select is : " + select + ", hour : " + hour + ", minute : " + minute + ", second : " + second + ", start hour : " + start_h + ", start minute : " + start_m + ", start second : " + start_s + ", stop hour : " + stop_h + ", stop minute : " + stop_m + ", stop second : " + stop_s); 	  
     		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			result = t.timeOptions(start, stop, select);
			System.out.println("Result hour : " + result.getHour() + ", Result minute : " + result.getMinute() + ", Result second : " + result.getSecond());
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			result = _t.timeOptions(start, stop, select);
			System.out.println("Result hour : " + result.getHour() + ", Result minute : " + result.getMinute() + ", Result second : " + result.getSecond());
	                }
                fis.close();    
              } catch (Exception e) { System.out.println(e); }    
         }    

	 public static boolean RunRAC(int constructor, int hour, int minute, int second, int start_h, int start_m, int start_s, int stop_h, int stop_m, int stop_s) {
		String _constructor = String.valueOf(constructor);
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
		driverArg = "JMLDriver " + _constructor + " " + _hour + " " + _minute + " " + _second + " " + _start_h + " " + _start_m + " " + _start_s + " " + _stop_h + " " + _stop_m + " " + _stop_s; 
		
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
