public class JMLDriver {
	public static void main(String[] argv) 
	{
		int size1 = Integer.parseInt(argv[0]);
		int size2 = Integer.parseInt(argv[1]);

		int[][] matrix = new int[size1][size2];

		int i = 2;	
		for (int j = 0; j < size1; j++)	{
        		for (int k = 0; k < size2; k++) {
            			matrix[j][k] = Integer.parseInt(argv[i]);
				k++;
			}
       		}	

		try { 
			TransposeMatrix t = new TransposeMatrix();
			t.transposeMat(matrix);
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

