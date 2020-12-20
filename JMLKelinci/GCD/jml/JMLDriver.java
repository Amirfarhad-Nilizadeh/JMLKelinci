public class JMLDriver {
	public static void main(String[] argv) 
	{
		int num1 = Integer.parseInt(argv[0]);
		int num2 = Integer.parseInt(argv[1]);
		try { 
			GCD g = new GCD();
			g.gcd(num1, num2);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

