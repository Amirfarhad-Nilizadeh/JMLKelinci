
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
		assertEquals(-1, a.lcm(1762263040, 0));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(1246580039, 1195853673));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-325758721, 9785599));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-403445785, -404232217));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(1734829927, a.lcm(1734829927, 1734829927));
	}

	@Test
	public void test6() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}

}
