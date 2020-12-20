public class JMLDriver {
	public static void main(String[] argv) 
	{
		int select = Integer.parseInt(argv[0]);
		int size = Integer.parseInt(argv[1]);
		try { 
			if (select == 0) {
				Fibonacci f = new Fibonacci();
			} else {
  				Fibonacci f = new Fibonacci(size);
			}
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

