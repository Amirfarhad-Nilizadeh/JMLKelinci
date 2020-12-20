
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
		assertEquals(-1, a.lcm(1514094426, 0));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(128, 1701603694));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(589505315, 589496413));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(33591488, -1476362338));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(771752192, a.lcm(771752192, 256));
	}

	@Test
	public void test6() {
		LCM a = new LCM();
		assertEquals(774778415, a.lcm(-774778415, -774778415));
	}

	@Test
	public void test7() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}

	@Test
	public void test8() {
		LCM a = new LCM();
		assertEquals(53491, a.lcm(-1, -53491));
	}
}
