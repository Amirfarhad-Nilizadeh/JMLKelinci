
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitTransposeMatrix {

	@Test
	public void test() {
		TransposeMatrix a = new TransposeMatrix();
		int mat[][] = new int [][]{{1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787},{1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089},{1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580},{1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685},{1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694},{1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787},{1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089},{172641612, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669},{1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778},{1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089},{1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132},{1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867},{1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669},{1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778},{1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580},{1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685},{1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694},{1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787},{1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089},{1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580},{1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685},{1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089},{1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132},{1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867},{1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669},{1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778},{1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089}};

		int old_mat[][] = mat.clone();
		int[][] res = a.transposeMat(mat);
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[0].length; j++){ 
				assertTrue("They are not Transpose", old_mat[i][j] == res[j][i]);
			}			
	}

	@Test
	public void test1() {
		TransposeMatrix a = new TransposeMatrix();
		int mat[][] = new int [][]{{1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089},{1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603707, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685},{1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 172641612, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132},{1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1701603694, 1667844685, 1280009580, 1768842089},{1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778},{1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132},{1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008714, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787},{1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 7234409, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579967, -32914, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580},{1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667858509, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694},{1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 172641612, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477088, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867},{1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778},{1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685},{1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787},{1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669},{1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1854237002, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089},{1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867},{1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008714, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089},{1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667852618},{1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579786, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867},{1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1815047779, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778},{1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008714, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685},{1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787},{1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 172641612, 1264938089, 1852008778, 1296845669},{1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089},{1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867},{1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089},{1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685}};

		int old_mat[][] = mat.clone();
		int[][] res = a.transposeMat(mat);
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[0].length; j++){ 
				assertTrue("They are not Transpose", old_mat[i][j] == res[j][i]);
			}			
	}


}


