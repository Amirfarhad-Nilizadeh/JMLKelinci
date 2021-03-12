public class JMLDriver {
	public static void main(String[] argv) 
	{
		int n = Integer.parseInt(argv[0]);
		int r = Integer.parseInt(argv[1]);
		boolean flag = Boolean.parseBoolean(argv[2]);
		try {
			CombinationPermutation s = new CombinationPermutation();
                	s.select(n, r, flag);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

