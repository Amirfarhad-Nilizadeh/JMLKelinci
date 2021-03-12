public class JMLDriver {
	public static void main(String[] argv) 
	{
		//System.out.println("argv[0] " + argv[0]);
		int num = Integer.parseInt(argv[0]);

		Factorial f = new Factorial();
                f.factorial(num);
	}
}

