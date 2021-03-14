
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitLinearSearch {

	@Test
	public void test() {
		LinearSearch a = new LinearSearch();
		boolean flag = false;
		int Search = 1667828298;
		int[] data = {1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1667828298, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 172641612, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008714, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694};
		int loc = a.linearSearch(Search, data);
		if (loc != -1)
			assertTrue(data[loc] == Search);
		else {
			for (int element : data) {
    				if (element == Search) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}		
	}


	@Test
	public void test1() {
		LinearSearch a = new LinearSearch();
		boolean flag = false;
		int Search = 1817005131;
		int[] data = {1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1279937868, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008764, 1296845669, 1818848867, 1766477132, 1259367529, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 879324771, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1499687242, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1114205795, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, -1989973686, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008714, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579871, -1616928865, -1616928865, -1616928865, -1616944279, 1246579787, 1701603694, 1667844685, 1280009580, 1767400297, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1248414795, 1701603694, 1667844685, 1279878508, 1768842089, 1246579787, 1701603694, 1667844685, 1263232364, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1282041196, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009546, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 16, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 946170985, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296842085, 1818848867, 1766477132, 1264938089, 1852009577, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842059, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1080976233, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701408355, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938043, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818842211, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579786, 1296845669, 1818848842, 1296845669, 1818848867, 1766477132, 1264938085, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1768517219, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264929867, 1701603694, 1668049262, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1851981898, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1265395052, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1231383657, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296858981, 1818820864, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1298492521, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1414286181, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938120, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1762282061, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246514021, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669};
		int loc = a.linearSearch(Search, data);
		if (loc != -1)
			assertTrue(data[loc] == Search);
		else {
			for (int element : data) {
    				if (element == Search) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}		
	}

}


