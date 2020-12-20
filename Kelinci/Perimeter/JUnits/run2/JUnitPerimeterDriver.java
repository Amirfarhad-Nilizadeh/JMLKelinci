
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPerimeterDriver{

	@Test
	public void test(){
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(760, a.Driver(1, 152, 16841728, 131072, 167903232, (short)0, 0));
	}
}
