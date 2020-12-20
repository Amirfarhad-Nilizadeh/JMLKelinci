
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitBinarySearch {

	@Test
	public void test() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 1701603694;
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
		int key = 1246579275;
		int[] data = {1600940398};
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
		int key = 1701609483;
		int[] data = {-83932595};
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
	public void test3() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 1263225675;
		int[] data = {1263225675, 1701594734, 2147483502};
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



