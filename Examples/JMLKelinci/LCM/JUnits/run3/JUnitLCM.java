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
		assertEquals(-1, a.lcm(1244392449, 53734401));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(989875325, -1604163328));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-8454144, 0));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-2130706433, -98391));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}

	@Test
	public void test6() {
		LCM a = new LCM();
		assertEquals(7895033, a.lcm(7895033, 7895033));
	}
}
