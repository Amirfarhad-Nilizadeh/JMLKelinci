public class JMLDriver {
	public static void main(String[] argv) 
	{
		int input = Integer.parseInt(argv[0]);
		try { 
			OddEven a = new OddEven();
			OddEven b = new OddEven();
			a.isEven(input);
			b.isOdd(input);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

