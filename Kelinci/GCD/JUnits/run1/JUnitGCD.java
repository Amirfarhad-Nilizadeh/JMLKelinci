
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
		assertEquals(4, a.gcd(1666010444, 1264935936));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(1320514816, a.gcd(1320514816, 0));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(5, a.gcd(1246616025, -640034320));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(9472, a.gcd(-9472, 0));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}

	@Test
	public void test6() {
		GCD a = new GCD();
		assertEquals(16777216, a.gcd(0, -16777216));
	}
}
