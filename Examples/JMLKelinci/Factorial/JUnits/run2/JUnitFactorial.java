
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitFactorial{

	@Test
	public void test() {
		Factorial a = new Factorial();
		assertEquals(121645100408832000L, a.Facto(19));
	}

	@Test
	public void test1() {
		Factorial a = new Factorial();
		assertEquals(1, a.Facto(0));
	}
}
