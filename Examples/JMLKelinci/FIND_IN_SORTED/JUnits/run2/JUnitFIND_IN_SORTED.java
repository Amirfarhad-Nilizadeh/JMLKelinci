
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFIND_IN_SORTED {
	@Test
	public void test() {
		int key = 1852008778;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {1296844901};
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
		int key = -2040313267;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {1280009580};
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
		int key = 1852008778;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {1852008778};
		int loc = find.find_in_sorted(array, key);

		if (loc != -1) {
			assertTrue("The value of array's location is not equal to the key value", array[loc] == key);	
		} else {
			for (int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array, but program did not find it", array[i] != key);
		}
	}
}



