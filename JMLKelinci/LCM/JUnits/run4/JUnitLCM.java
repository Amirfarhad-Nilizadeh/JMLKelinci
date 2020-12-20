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
		assertEquals(-1, a.lcm(2105376125, -488447262));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-16809989, -1337950208));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(16777216, 0));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(1, a.lcm(-1, -1));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}

}
