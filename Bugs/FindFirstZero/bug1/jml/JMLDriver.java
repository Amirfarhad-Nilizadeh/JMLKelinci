public class JMLDriver {
	public static void main(String[] argv) 
	{
		int[] arr = new int[argv.length];
		
        	for (int i = 0; i < argv.length; i++) {
            		arr[i] = Integer.parseInt(argv[i]);
       		}
		try { 
			FindFirstZero find = new FindFirstZero();
			find.FindFirstZero(arr);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

