
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test() {
		AddLoop a = new AddLoop();
		assertEquals(922746880, a.AddLoop(922746880, 0));
	}

	@Test
	public void test1() {
		AddLoop a = new AddLoop();
		assertEquals(2071690107, a.AddLoop(1583242846, 488447261));
	}

	@Test
	public void test2() {
		AddLoop a = new AddLoop();
		assertEquals(-1816991535, a.AddLoop(31843553, -1848835088));
	}

}
