
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
		assertEquals(757923840, a.gcd(757923840, 0));
	}

	@Test
	public void test2() {
		GCD a = new GCD();
		assertEquals(3, a.gcd(1248158535, 176178954));
	}

	@Test
	public void test3() {
		GCD a = new GCD();
		assertEquals(16777216, a.gcd(-16777216, 0));
	}

	@Test
	public void test4() {
		GCD a = new GCD();
		assertEquals(32, a.gcd(16774944, -92239328));
	}


	@Test
	public void test5() {
		GCD a = new GCD();
		assertEquals(-1, a.gcd(0, 0));
	}

	@Test
	public void test6() {
		GCD a = new GCD();
		assertEquals(65564411, a.gcd(0, 65564411));
	}
}
