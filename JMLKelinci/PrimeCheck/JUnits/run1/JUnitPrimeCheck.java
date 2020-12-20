
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPrimeCheck {

	@Test
	public void test() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(false, p.isPrime(1246579787));
	}

	@Test
	public void test1() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(true, p.isPrime(1246190879));
	}
}
