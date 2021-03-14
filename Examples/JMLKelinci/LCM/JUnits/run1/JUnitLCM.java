import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitLCM {

	@Test
	public void test() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(1246579787, 1701603694));
	}

	@Test
	public void test1() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(690552832, 0));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-1320353791, 1701603694));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-1409319003, -1616930940));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(1716341835, 1701603694));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(522133279, a.lcm(522133279, 522133279));
	}

	@Test
	public void test6() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}

	@Test
	public void test7() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(1289551663, 1852000589));
	}

}
