
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitBinarySearch {

	@Test
	public void test() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 1852008805;
		int[] data = {84332};
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
		int key = 1701603584;
		int[] data = {-2140320693, 1970632053, 1970632053};
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
		int key = 1280068684;
		int[] data = {1280068684};
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
		int key = 1849981562;
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



