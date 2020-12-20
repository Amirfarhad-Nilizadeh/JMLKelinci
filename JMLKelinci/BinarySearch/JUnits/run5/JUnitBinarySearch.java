
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitBinarySearch {

	@Test
	public void test() {
		BinarySearch a = new BinarySearch();
		boolean flag = false;
		int key = 6580557;
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
		int key = -1497389313;
		int[] data = {-16777088, 1766457344};
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
		int key = 1306881279;
		int[] data = {-16777142, 1296845669};
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
		int key = -623191334;
		int[] data = {-623191334, -623191334};
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



