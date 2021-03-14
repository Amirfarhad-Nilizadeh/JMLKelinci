
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAddLoop {

	@Test
	public void test(){
		AddLoop a = new AddLoop();
		assertEquals(-1174405120, a.AddLoop(-1174405120, 0));
	}

	@Test
	public void test1(){
		AddLoop a = new AddLoop();
		assertEquals(384670104, a.AddLoop(1243663564, -858993460));
	}
}
