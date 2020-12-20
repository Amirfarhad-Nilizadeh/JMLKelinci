
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFIND_IN_SORTED {
	@Test
	public void test() {
		int key = 1986816366;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {};
		int loc = find.find_in_sorted(array, key);

		if (loc != -1) {
			assertTrue("The value of array's location is not equal to the key value", array[loc] == key);	
		} else {
			for (int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array, but program did not find it", array[i] != key);
		}
	}

	@Test
	public void test1() {
		int key = 1717986918;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918};
		int loc = find.find_in_sorted(array, key);

		if (loc != -1) {
			assertTrue("The value of array's location is not equal to the key value", array[loc] == key);	
		} else {
			for (int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array, but program did not find it", array[i] != key);
		}
	}

	@Test
	public void test2() {
		int key = 1650878054;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918};
		int loc = find.find_in_sorted(array, key);

		if (loc != -1) {
			assertTrue("The value of array's location is not equal to the key value", array[loc] == key);	
		} else {
			for (int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array, but program did not find it", array[i] != key);
		}
	}



	@Test
	public void test3() {
		int key = 1717986919;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918, 1717986918};
		int loc = find.find_in_sorted(array, key);

		if (loc != -1) {
			assertTrue("The value of array's location is not equal to the key value", array[loc] == key);	
		} else {
			for (int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array, but program did not find it", array[i] != key);
		}
	}
}



