public class JMLDriver {
	public static void main(String[] argv) 
	{
		int constructor = Integer.parseInt(argv[0]);
		int select = Integer.parseInt(argv[1]);
		int hour = Integer.parseInt(argv[2]);
		int minute = Integer.parseInt(argv[3]);
		int second = Integer.parseInt(argv[4]);
		int start_h = Integer.parseInt(argv[5]);
		int start_m = Integer.parseInt(argv[6]);
		int start_s = Integer.parseInt(argv[7]);
		int stop_h = Integer.parseInt(argv[8]);
		int stop_m = Integer.parseInt(argv[9]);
		int stop_s = Integer.parseInt(argv[10]);

		try { 
			Time start = new Time(start_h, start_m, start_s);
			Time stop = new Time(stop_h, stop_m, stop_s);
			if (constructor == 0) {
				Time t = new Time();
				t.timeOptions(start, stop, select);
			} else {
				Time _t = new Time(hour, minute, second);
				_t.timeOptions(start, stop, select);
	                }
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

