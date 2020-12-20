
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test() {
		AddLoop a = new AddLoop();
		assertEquals(-654311424, a.AddLoop(-654311424, 0));
	}

	@Test
	public void test1() {
		AddLoop a = new AddLoop();
		assertEquals(-1616994656, a.AddLoop(32, -1616994688));
	}

	@Test
	public void test2() {
		AddLoop a = new AddLoop();
		assertEquals(550194266, a.AddLoop(541868635, 8325631));
	}

}
