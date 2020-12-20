
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPerimeterDriver {

	@Test
	public void test() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(5, a.Driver(1, 1, 1, 1701603702, 1818848579, (short)-2057, 1621287035265810679L));
	}

	@Test
	public void test1() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(988, a.Driver(0, 1701603702, 1818848579, -134801793, -134744073, (short)247, -578722012111210900L));
	}

	@Test
	public void test2() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(1208749068, a.Driver(4, 1074004996, 67372036, 67372036, 67371012, (short)1034, -578977517659621641L));
	}

	@Test
	public void test3() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(1970039109, a.Driver(5, 1, 1, 1701603584, 268435523, (short)-2057, 1621287035265810679L));
	}

	@Test 
	public void test4() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(269491694, a.Driver(3, 67372032, 67373815, -150010906, -168364288, (short)16631, 2591784167647796727L));
	}

	@Test
	public void test5() {
		PerimeterDriver a = new PerimeterDriver();
		assertEquals(14020887187950L, a.Driver(2, 269811714, -33613053, -184466944, -50324733, (short)-2816, 2336814531325L));
	}
}
