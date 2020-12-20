public class JMLDriver {
	public static void main(String[] argv) 
	{
		int[] arr = new int[argv.length-1];
		int i = 0;
        	for (; i < argv.length - 1; i++) {
            		arr[i] = Integer.parseInt(argv[i]);
       		}

		int key = Integer.parseInt(argv[i]);

		try { 
			BinarySearch b = new BinarySearch();
			b.Binary(arr, key);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

