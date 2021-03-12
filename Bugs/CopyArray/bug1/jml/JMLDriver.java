public class JMLDriver {
	public static void main(String[] argv) 
	{
		int iBegin = Integer.parseInt(argv[0]);
		int iEnd = Integer.parseInt(argv[1]);
		int arrLength1 = Integer.parseInt(argv[2]);
		int arrLength2 = Integer.parseInt(argv[3]);

		int[] arr1 = new int[arrLength1];
		int[] arr2 = new int[arrLength2];

		int i = 4;		
        	for (int j = 0; j < arrLength1; i++, j++) {
            		arr1[j] = Integer.parseInt(argv[i]);
       		}

		for (int j = 0; j < arrLength2; i++, j++) {
            		arr2[j] = Integer.parseInt(argv[i]);
       		}	

		try { 
			CopyArray c = new CopyArray();
			c.CopyArray(arr1, iBegin, iEnd, arr2);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

