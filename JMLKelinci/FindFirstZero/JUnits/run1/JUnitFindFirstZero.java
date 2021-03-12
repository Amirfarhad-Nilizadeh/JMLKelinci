
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFindFirstZero {

	@Test
	public void test() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 172641612, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008714, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 172641612, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762265699, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}
	}

	@Test
	public void test1() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test2() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844863, -16777108, 1768842089, 1246579787, 1701603694, 1667853923, 1766484298, 1296845669, 1818848867, 85324, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1853974858, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845568, -9867677, 1766477132, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768833129, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1675250253, 1280009580, 1768842089, 1246579787, 1701603694, 1667844656, 1280009580, 1768842089, 1246579787, 1701603694, 1666468429, 1280009580, 1768842089, 1248021579, 1701609471, 1667844685, 1280000620, 1768842089, 1701603694, 1667844685, 1280009580, 1768842089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296715084, 1264938089, 1852008778, 1296845669, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848876, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845701, 1818848867, 1766481746, 1264936960, 33554506, 1296845669, 1818848867, 1768507981, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1242319947, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1751477353, 1852008778, 1296845669, 1818848867, 1766477132, 912616553, 1852008778, 1296845669, 1818848867, 1766477132, 1264942185, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852860746, 1296845669, 1818820608, 8408396, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1751477353, 778266954, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008781, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603692, 1768842089, 1248748393, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}
}