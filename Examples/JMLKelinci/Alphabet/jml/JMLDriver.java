public class JMLDriver {
	public static void main(String[] argv) 
	{
		int option = Integer.parseInt(argv[0]);
		int _char = Integer.parseInt(argv[1]);
		try { 
			Alphabet a = new Alphabet((char)_char);
			a.driver(option);	
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

