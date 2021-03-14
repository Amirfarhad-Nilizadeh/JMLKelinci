public class JMLDriver {
	public static void main(String[] argv) 
	{
		int select = Integer.parseInt(argv[0]);
		int num1 = Integer.parseInt(argv[1]);
		int num2 = Integer.parseInt(argv[2]);
		int num3 = Integer.parseInt(argv[3]);
		int num4 = Integer.parseInt(argv[4]);
		short shortNum = (short)Integer.parseInt(argv[5]);
		long longNum = Long.parseLong(argv[6]);
		try { 
			PerimeterDriver d = new PerimeterDriver();
			d.driver(select, num1, num2, num3, num4, shortNum, longNum);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

