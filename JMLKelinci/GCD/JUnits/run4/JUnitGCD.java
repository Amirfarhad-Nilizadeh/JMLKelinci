
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
		assertEquals(3, a.gcd(-2139127959, 1023438471));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(12058624, a.gcd(-12058624, 0));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(3, a.gcd(-201375033, -943208505));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}


	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(553123691, a.gcd(0, 553123691));
	}
}
