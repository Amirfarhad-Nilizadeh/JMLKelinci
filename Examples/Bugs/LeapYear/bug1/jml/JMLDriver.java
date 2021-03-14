public class JMLDriver {
	public static void main(String[] argv) 
	{
		int year = Integer.parseInt(argv[0]);
		try { 
			LeapYear y = new LeapYear();
			y.isLeapYear(year);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

