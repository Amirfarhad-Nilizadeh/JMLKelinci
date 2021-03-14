
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
		int key = 1701602414;
		int[] data = {543771213, 1280009580};
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
		int key = 1701602414;
		int[] data = {1280071279, 1819044972};
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
		int key = 1701602414;
		int[] data = {543771226, 1701602414};
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



