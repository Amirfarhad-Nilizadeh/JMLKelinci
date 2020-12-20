public class JMLDriver {
	public static void main(String[] argv) 
	{
		int even = Integer.parseInt(argv[0]);
		try { 
			Even a = new Even();
			a.isEven(even);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

