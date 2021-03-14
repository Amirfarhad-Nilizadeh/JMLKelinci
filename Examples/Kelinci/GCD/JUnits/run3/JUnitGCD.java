
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
		assertEquals(2, a.gcd(-100663046, 1701607790));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(16, a.gcd(2139085776, 743103440));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(235864064, a.gcd(-235864064, 0));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(1246625791, -8427161));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(25600, a.gcd(0, 25600));
	}

	@Test
	public void test6() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}
}
