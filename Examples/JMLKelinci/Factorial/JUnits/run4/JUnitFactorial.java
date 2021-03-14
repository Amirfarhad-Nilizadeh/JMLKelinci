
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitFactorial{

	@Test
	public void test() {
		Factorial a = new Factorial();
		assertEquals(20922789888000L, a.Facto(16));
	}

	@Test
	public void test1() {
		Factorial a = new Factorial();
		assertEquals(1, a.Facto(0));
	}
}
