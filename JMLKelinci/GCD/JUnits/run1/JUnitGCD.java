
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
		assertEquals(128, a.gcd(-2147467264, 25198720));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(1255795177, -370546199));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(1509949440, a.gcd(-1509949440, 0));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(7032, a.gcd(0, 7032));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}

}
