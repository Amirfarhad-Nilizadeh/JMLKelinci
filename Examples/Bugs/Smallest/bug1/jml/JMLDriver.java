public class JMLDriver {
	public static void main(String[] argv) 
	{
		int[] arr = new int[argv.length];
	
        	for (int i = 0; i < argv.length - 1; i++) {
            		arr[i] = Integer.parseInt(argv[i]);
       		}

		try { 
			Smallest s = new Smallest();
			s.Smallest(arr);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

