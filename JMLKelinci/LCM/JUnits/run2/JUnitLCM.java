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
		assertEquals(-1, a.lcm(1230168914, -2140413102));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-305009408, 0));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-2147450752, -16613249));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(1920103026, a.lcm(1920103026, 1920103026));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}
}
