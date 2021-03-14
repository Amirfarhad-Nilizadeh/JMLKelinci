public class JMLDriver {
	public static void main(String[] argv) 
	{
		String str = argv[0];
		try { 
			StrPalindrome p = new StrPalindrome();
			p.isPalindrome(str);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

