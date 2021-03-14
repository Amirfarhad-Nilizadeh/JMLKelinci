
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPerimeterDriver {

	@Test
	public void test() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(8502120375L, a.Driver(1, 1700424075, 1181289099, 0, 0, (short)0, 0));
	}

	@Test
	public void test1() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(64, a.Driver(0, 369098816, -16770816, 6553600, 2030960640, (short)16, -216039681077280768L));
	}

	@Test
	public void test2() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(901845831923859450L, a.Driver(2, 369098752, 136704, 4259584, 34996224, (short)18, 150307638653976575L));
	}

	@Test
	public void test3() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(612473743, a.Driver(4, 25, 402661885, 209811833, 243366265, (short)0, 0));
	}

	@Test 
	public void test4() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(738197504, a.Driver(3, 134217728, 234881024, 0, 0, (short)0, 0));
	}

	@Test
	public void test5() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(620897302, a.Driver(5, 25, 402661885, 209780992, 8454400, (short)0, 0));
	}
}
