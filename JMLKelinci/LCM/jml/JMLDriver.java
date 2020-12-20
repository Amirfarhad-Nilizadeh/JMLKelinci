public class JMLDriver {
	public static void main(String[] argv) 
	{
		int num1 = Integer.parseInt(argv[0]);
		int num2 = Integer.parseInt(argv[1]);
		try { 
			LCM l = new LCM();
			l.lcm(num1, num2);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

