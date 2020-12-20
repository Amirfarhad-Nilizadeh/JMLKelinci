
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test(){
		AddLoop a = new AddLoop();
		assertEquals(1073741824, a.AddLoop(1073741824, 0));
	}

	@Test
	public void test1(){
		AddLoop a = new AddLoop();
		assertEquals(1246515054, a.AddLoop(1246579967, -64913));
	}
}
