
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
		assertEquals(570425344, a.gcd(570425344, 0));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(2960685, a.gcd(757935360, 2960685));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(926239997, -252645352));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(16777216, a.gcd(-16777216, 0));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}

	@Test
	public void test6() {
		GCD a = new GCD();
		assertEquals(8454144, a.gcd(0, -8454144));
	}
}
