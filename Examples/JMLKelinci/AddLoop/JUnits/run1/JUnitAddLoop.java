
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test() {
		AddLoop a = new AddLoop();
		assertEquals(-50339334, a.AddLoop(-50339334, 0));
	}

	@Test
	public void test1() {
		AddLoop a = new AddLoop();
		assertEquals(245473696, a.AddLoop(550555856, -305082160));
	}

	@Test
	public void test2() {
		AddLoop a = new AddLoop();
		assertEquals(197134788, a.AddLoop(1250, 197133538));
	}

}
