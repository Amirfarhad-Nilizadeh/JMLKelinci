
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitOddEven {

	@Test
	public void test() {
		OddEven a = new OddEven();
		OddEven b = new OddEven();
		boolean result = a.isEven(1246579787);
		boolean result1 = b.isEven(1246579787);
		assertEquals(false, result);
		assertEquals(true, result1);
	}

	@Test
	public void test1() {
		OddEven a = new OddEven();
		OddEven b = new OddEven();
		boolean result = a.isEven(0);
		boolean result1 = b.isEven(0);
		assertEquals(true, result);
		assertEquals(false, result);
	}
}
