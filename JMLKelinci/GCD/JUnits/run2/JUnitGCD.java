
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
		assertEquals(1891088370, a.gcd(1891088370, 0));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(1212696649, a.gcd(-1212696649, -1212696649));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(6, a.gcd(-548569284, 16494));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(6883840, a.gcd(0, 6883840));
	}

	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}

}
