public class JMLDriver {
	public static void main(String[] argv) 
	{
		int[] arr = new int[argv.length-2];
		int i = 0;
        	for (; i < argv.length - 2; i++) {
            		arr[i] = Integer.parseInt(argv[i]);
       		}

		int searchKey = Integer.parseInt(argv[i]);
		int constructor = Integer.parseInt(argv[++i]);

		try { 
			if (constructor == 0) {
				FindInArray p = new FindInArray(arr);
			} else {
				FindInArray p1 = new FindInArray(arr, searchKey);
			}	
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

