
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFIND_IN_SORTED {
	@Test
	public void test() {
		int key = 1701603694;
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
		int key = 1701603694;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {1667844685};
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
		int key = 1296845669;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {1818840419};
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
		int key = 50529027;
		FIND_IN_SORTED find = new FIND_IN_SORTED();
		int[] array = {50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027, 50529027};
		int loc = find.find_in_sorted(array, key);

		if (loc != -1) {
			assertTrue("The value of array's location is not equal to the key value", array[loc] == key);	
		} else {
			for (int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array, but program did not find it", array[i] != key);
		}
	}
}



