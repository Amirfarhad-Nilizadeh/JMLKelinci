public class JMLDriver {
	public static void main(String[] argv) 
	{
		int num = Integer.parseInt(argv[0]);
		try { 
			 PrimeCheck p = new PrimeCheck();
			 p.isPrime(num);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

