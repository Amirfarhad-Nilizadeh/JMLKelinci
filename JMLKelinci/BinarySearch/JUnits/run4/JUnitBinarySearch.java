
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitBinarySearch {

	@Test
	public void test() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 256;
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

	@Test
	public void test1() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 1797877333;
		int[] data = {1246591353, 2038004089, 2038004089, 2038004089, 2038004089, 2038004089, 2038004089};
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

	@Test
	public void test2() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 1263225675;
		int[] data = {1263225675, 1263225675, 1263225675};
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



