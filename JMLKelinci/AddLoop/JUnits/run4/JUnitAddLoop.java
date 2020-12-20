
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test() {
		AddLoop a = new AddLoop();
		assertEquals(553648128, a.AddLoop(553648128, 0));
	}

	@Test
	public void test1() {
		AddLoop a = new AddLoop();
		assertEquals(1423754954, a.AddLoop(1248748389, 175006565));
	}

	@Test
	public void test2() {
		AddLoop a = new AddLoop();
		assertEquals(326472084, a.AddLoop(1254672584, -928200500));
	}

}
