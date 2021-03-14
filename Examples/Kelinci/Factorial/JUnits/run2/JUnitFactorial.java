
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitFactorial {

	@Test
	public void test1() {
		Factorial a = new Factorial();
		assertEquals(1, a.Facto(0));
	}

}
