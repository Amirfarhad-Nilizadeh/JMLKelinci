
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitGCD {
	@Test
	public void test() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(1246579787, 1701603694));
	}

	@Test
	public void test1() {
		GCD a = new GCD();
		assertEquals(490775412, a.gcd(490775412, 0));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(134217728, a.gcd(-134217728, 0));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(4, a.gcd(1254409412, -993737532));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(786432, a.gcd(0, 786432));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}
}
