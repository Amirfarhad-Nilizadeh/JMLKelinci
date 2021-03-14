public class JMLDriver {
	public static void main(String[] argv) 
	{
		int arrLength1 = Integer.parseInt(argv[0]);
		int arrLength2 = Integer.parseInt(argv[1]);

		int[] arr1 = new int[arrLength1];
		int[] arr2 = new int[arrLength2];

		int i = 2;		
        	for (int j = 0; j < arrLength1; i++, j++) {
            		arr1[j] = Integer.parseInt(argv[i]);
       		}

		for (int j = 0; j < arrLength2; i++, j++) {
            		arr2[j] = Integer.parseInt(argv[i]);
       		}	

		try { 
			Inverse p = new Inverse();
               		p.Inverse(arr1, arr2);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

