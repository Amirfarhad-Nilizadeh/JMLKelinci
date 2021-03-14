public class JMLDriver {
	public static void main(String[] argv) 
	{
		short n1 = (short)Integer.parseInt(argv[0]);
		int n2 = Integer.parseInt(argv[1]);
		long n3 = Long.parseLong(argv[2]);
		try {
			AbsoluteDriver a = new AbsoluteDriver(n1, n2, n3);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

