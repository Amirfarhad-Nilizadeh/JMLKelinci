
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test() {
		AddLoop a = new AddLoop();
		assertEquals(1073741824, a.AddLoop(1073741824, 0));
	}

	@Test
	public void test1() {
		AddLoop a = new AddLoop();
		assertEquals(1179010685, a.AddLoop(589505315, 589505370));
	}

	@Test
	public void test2() {
		AddLoop a = new AddLoop();
		assertEquals(206334463, a.AddLoop(1246560256, -1040225793));
	}

}
