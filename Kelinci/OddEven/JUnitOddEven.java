
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitOddEven {

	@Test
	public void test() {
		OddEven a = new OddEven();
		OddEven b = new OddEven();
		boolean result = a.isEven(1246579787);
		boolean result1 = b.isOdd(1246579787);
		assertEquals(false, result);
		assertEquals(true, result1);
	}

	@Test
	public void test1() {
		OddEven a = new OddEven();
		OddEven b = new OddEven();
		boolean result = a.isEven(1241514272);
		boolean result1 = a.isOdd(1241514272);
		assertEquals(true, result);
		assertEquals(false, result1);
	}
}
