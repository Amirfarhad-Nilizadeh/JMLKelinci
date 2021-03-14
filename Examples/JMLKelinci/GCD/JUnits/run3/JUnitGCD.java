
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
		assertEquals(1242169344, a.gcd(1242169344, 0));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(1, a.gcd(1246579787, -8352914));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(437918235, a.gcd(-437918235, -437918235));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(522133279, a.gcd(0, 522133279));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}

}
