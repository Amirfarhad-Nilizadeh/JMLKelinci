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
		assertEquals(-1, a.lcm(-1509949440, 0));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(1246579812, -2147456686));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(1245395771, 993737531));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-1522469120, 1091502145));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(1, a.lcm(-1, -1));
	}

	@Test
	public void test6() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}
}
