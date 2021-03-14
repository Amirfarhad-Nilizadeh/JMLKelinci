
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
		assertEquals(520093696, a.gcd(520093696, 0));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(134217728, a.gcd(-134217728, 0));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(1058020927, 283476353));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(-2105376157, -2105376126));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(1701597038, a.gcd(0, 1701597038));
	}

	@Test
	public void test6() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}
}
