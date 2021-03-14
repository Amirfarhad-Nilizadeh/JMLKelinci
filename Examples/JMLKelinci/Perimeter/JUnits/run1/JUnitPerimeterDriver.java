
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPerimeterDriver {

	@Test
	public void test() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(8508018470L, a.Driver(1, 1701603694, 1667828334, 0, 0, (short)0, 0));
	}

	@Test
	public void test1() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(9728, a.Driver(0, 16744292, 0, 65407, 1677721600, (short)2432, 7812735519021688425L));
	}

	@Test
	public void test2() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(1709100949L, a.Driver(5, 1701603684, 6553793, 589824, 353648, (short)28784, 8102099357864587376L));
	}

	@Test
	public void test3() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(1779957712, a.Driver(4, 16744292, 1762590720, 622700, 1818857367, (short)23930, 7570269498633093120L));
	}

	@Test 
	public void test4() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(181010944, a.Driver(3, 256, 90505216, -125871094, 0, (short)0, 0));
	}

	@Test
	public void test5() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(431497119258138624L, a.Driver(2, 16744292, 16, 6016, 1677721600, (short)-32768, 71916186543023104L));
	}
}
