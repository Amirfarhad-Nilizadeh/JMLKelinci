public class JMLDriver {
	public static void main(String[] argv) 
	{
		int num1 = Integer.parseInt(argv[0]);
		int num2 = Integer.parseInt(argv[1]);
		char op = argv[2].charAt(0);
		try { 
			Calculator cal = new Calculator();
			cal.calculate(num1, num2, op); 
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

