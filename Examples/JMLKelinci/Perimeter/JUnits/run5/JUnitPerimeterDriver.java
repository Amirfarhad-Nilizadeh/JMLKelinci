
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPerimeterDriver {

	@Test
	public void test() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(32, a.Driver(0, 221, 255, -1536, 0, (short)8, 139637976727552L));
	}

	@Test
	public void test1() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(1929379840L, a.Driver(1, 385875968, 7211520, 0, 0, (short)0, 0));
	}

	@Test
	public void test2() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(13197562048512L, a.Driver(2, 2162795, -387388696, -387389208, -387389208, (short)-5912, 2199593674752L));
	}

	@Test
	public void test3() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(202116108, a.Driver(4, 67372036, 67372036, 67372036, 67430646, (short)-5912, 8207728616L));
	}

	@Test 
	public void test4() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(12834258, a.Driver(3, 6356993, 60136, -387389440, 8388584, (short)-5912, 2199593674752L));
	}

	@Test
	public void test5() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(269546763, a.Driver(5, 67372036, 67372036, 67372036, 67430655, (short)-24, 8207728616L));
	}
}
