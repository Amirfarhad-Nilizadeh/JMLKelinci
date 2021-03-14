
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPerimeterDriver {

	@Test
	public void test() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(524, a.Driver(0, 6648177, 1534191233, 157643121, 1903289856, (short)131, 3920675945719005184L));
	}

	@Test
	public void test1() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(44054325, a.Driver(1, 8810865, 268447601, 0, 0, (short)0, 0));
	}

	@Test
	public void test2() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(1698482531L, a.Driver(4, 6648177, 1534191233, 157643121, 1903289856, (short)131, 2767754441112158208L));
	}

	@Test
	public void test3() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(537133796, a.Driver(3, 65649, 268501249, -83885823, 16843009, (short)257, 72340172824313856L));
	}

	@Test 
	public void test4() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(434041036945883136L, a.Driver(2, -851855, 268501249, -83885698, 16843009, (short)257, 72340172824313856L));
	}

	@Test
	public void test5() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(336860180, a.Driver(5, 84215045, 84215045, 84215045, 84215045, (short)1285, 361700864190383365L));
	}
}
