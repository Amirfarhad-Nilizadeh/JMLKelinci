
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test(){
		AddLoop a = new AddLoop();
		assertEquals(1073741824, a.AddLoop(1073741824, 0));
	}

}
