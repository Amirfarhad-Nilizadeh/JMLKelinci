
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFIND_FIRST_IN_SORTED {

	@Test
	public void test() {
		int key = 1296911693;
		FIND_FIRST_IN_SORTED find = new FIND_FIRST_IN_SORTED();
		int[] array = {1296911693, 1296911693, 1296911693, 1298950510, 1667844685};
		int loc = find.find_first_in_sorted(array, key);

		if(loc != -1) {
			assertTrue("The value of array's location is not equal to key", array[loc] == key);	
			for(int i = 0; i < loc; i++)
				assertTrue("There is a key value before detected location", array[i] != 0);
		} else {
			for(int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array but program did not find it", array[i] != key);
		}
	}

	@Test
	public void test1() {
		int key = 1296911715;
		FIND_FIRST_IN_SORTED find = new FIND_FIRST_IN_SORTED();
		int[] array = {1296911693, 1296911693, 1296911693, 1298950510, 1667844685};
		int loc = find.find_first_in_sorted(array, key);

		if(loc != -1) {
			assertTrue("The value of array's location is not equal to key", array[loc] == key);	
			for(int i = 0; i < loc; i++)
				assertTrue("There is a key value before detected location", array[i] != 0);
		} else {
			for(int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array but program did not find it", array[i] != key);
		}
	}

	@Test
	public void test2() {
		int key = 1296911693;
		FIND_FIRST_IN_SORTED find = new FIND_FIRST_IN_SORTED();
		int[] array = {1296911669, 1296911693, 1296911693, 1298950510, 1667844685};
		int loc = find.find_first_in_sorted(array, key);

		if(loc != -1) {
			assertTrue("The value of array's location is not equal to key", array[loc] == key);	
			for(int i = 0; i < loc; i++)
				assertTrue("There is a key value before detected location", array[i] != 0);
		} else {
			for(int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array but program did not find it", array[i] != key);
		}
	}

	@Test
	public void test3() {
		int key = 2138864764;
		FIND_FIRST_IN_SORTED find = new FIND_FIRST_IN_SORTED();
		int[] array = {};
		int loc = find.find_first_in_sorted(array, key);

		if(loc != -1) {
			assertTrue("The value of array's location is not equal to key", array[loc] == key);	
			for(int i = 0; i < loc; i++)
				assertTrue("There is a key value before detected location", array[i] != 0);
		} else {
			for(int i = 0; i < array.length; i++)
				assertTrue("The key value is in the array but program did not find it", array[i] != key);
		}
	}
}
