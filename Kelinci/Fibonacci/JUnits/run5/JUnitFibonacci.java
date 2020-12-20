
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitFibonacci {

	@Test
	public void test() {
		Fibonacci a = new Fibonacci();
		a.fibCompute();
		assertEquals(1, a.getFib(1));
		assertEquals(0, a.getFib(0));
	}

	@Test
	public void test1() {
		Fibonacci a = new Fibonacci(63);
		a.fibCompute();
		assertEquals(4052739537881L, a.getFib(62));
	}

}
