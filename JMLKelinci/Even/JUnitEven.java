
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitEven {

	@Test
	public void test() {
		Even a = new Even();
		boolean result = a.isEven(1246579787);
		assertEquals(false, result);
	}

	@Test
	public void test1() {
		Even a = new Even();
		boolean result = a.isEven(0);
		assertEquals(true, result);
	}
}
