
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPerimeterDriver{

	@Test
	public void test(){
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(4312064, a.Driver(3, 2155776, 256, 31614986, 1745512458, (short)0, 0));
	}

	@Test
	public void test1(){
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(620800, a.Driver(1, 124160, 256, 31614986, 1745512458, (short)0, 0));
	}
}
