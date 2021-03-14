
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitBinarySearch {
	@Test
	public void test() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = -1067094935;
		int[] data = {};
		int loc = a.Binary(data, key);
		if (loc != -1)
			assertTrue(data[loc] == key);
		else {
			for (int element : data) {
    				if (element == key) {
        				flag = true;
   				 }
			}
			assertTrue(flag == false);
		}				
	}
}



