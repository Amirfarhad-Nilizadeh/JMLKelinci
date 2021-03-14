
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFindInArray {

	@Test
	public void test() {
		
		int key = 1667844685;
		int[] array = {1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694, 1667844685, 1280009580, 1768842089, 1246579787, 1701603694};
		FindInArray a = new FindInArray(array, key);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if (first != -1) {
			assertTrue("The value of array is not equal to key ", array[first] == key);	
			for (int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != key);

			assertTrue("The value of array is not equal to key ", array[last] == key);	
			for (int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != key);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a key value but the method did not find it", array[i] != key);
		}

		assertTrue("There is more than one key value, but the method did not find it", moreThanOneKey == true);
	}

	@Test
	public void test1() {
		
		int[] array = {};
		FindInArray a = new FindInArray(array);
		int first = a.findFirst();
		int last = a.findLast();
		boolean moreThanOneKey = a.isMoreThanOneKey();

		if (first != -1) {
			assertTrue("The value of array is not equal to key ", array[first] == 0);	
			for (int i = 0; i < first; i++)
				assertTrue("There is a key value before expected first location", array[i] != 0);

			assertTrue("The value of array is not equal to key ", array[last] == 0);	
			for (int i = array.length - 1; last < i; i--)
				assertTrue("There is a key value after expected last location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}

		assertTrue("There is moe tha a zero value but the method did not find it", moreThanOneKey == false);
	}

}
