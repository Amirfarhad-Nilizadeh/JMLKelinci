
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test(){
		AddLoop a = new AddLoop();
		assertEquals(218103808, a.AddLoop(218103808, 0));
	}

	@Test
	public void test1(){
		AddLoop a = new AddLoop();
		assertEquals(1575897516, a.AddLoop(1585007178, -9109662));
	}
}
