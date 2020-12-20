
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
		int Search = 1852000845;
		int[] data = {1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844683, 1280009580, 1768842089, 1246579817, 1246587210, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818454346, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296836736, 6909539, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938061, 1280009580, 1768835941, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1816939365, 1969843811, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 2147437877, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008753, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1851981824, 1067877, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766673483, 1701603694, 1667844685, 1280009580, 1768842089, 1817005131, 1701603694, 1667844685, 1280008044, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1262644329, 1852008778, 1296885093, 1818586723, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008780, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1766477161, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845695, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766478156, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845823, -32669, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008714, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009546, 1246382666, 1246382666, 1246382666, 1246382666, 1246382666, 1246391401, 1852008800, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1298221925, 1818848867, 1766477132, 1264938089, 1852001356, 1280068684, 1280068684, 1280076106, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264936041, 1852008778, 1296845669, 1818848768, 273304908, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296842597, 1818848867, 1766477132, 1264938089, 1852008809, 1246579787, 1701603694, 1667844685, 1852008778, 1296845669, 1818848867, 1766476875, 1701603694, 1667852877, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1500277102, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296847461, 1818848867, 1766477132, 1263357003, 1701603694, 1667844685, 1281715305, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1514818892, 1264938089, 1852008778, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667825741, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 594102861, 1280009580, 1768842089, 1246579787, 1701603694, 1114196557, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1699498853, 1818848867, 1766477132, 1264910464, 1852008778, 1296845669, 1818848867, 1766477164, 1768842089, 1246579787, 1701603694, 1667844685, 1028351340, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, 1818848867, 1766476364, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848844, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 978078565, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1275068671, -9542807, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701623406, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1684826478, 1667844685, 1280009586, 1768842089, 1246579787, 1701603694, 1667825664, 65561964, 1768842089, 1246579787, 1701603694, 1667828298, 1296845669, -1939247517, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089, 1852008778, 1296845669, 1818848867, 1766477132, 1264938089};
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



