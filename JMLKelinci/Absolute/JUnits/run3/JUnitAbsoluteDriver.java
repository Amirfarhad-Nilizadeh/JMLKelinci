import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAbsoluteDriver {

	@Test
	public void test() {
		AbsoluteDriver a = new AbsoluteDriver((short)19021, 1280009580, 7597118924211093504L);
		a.Driver();
		assertEquals(19021, a.sh);
		assertEquals(1280009580, a.i);
		assertEquals(7597118924211093504L, a.l);
	}

	@Test
	public void test1() {
		AbsoluteDriver a = new AbsoluteDriver((short)0, -167772392, 0);
		a.Driver();
		assertEquals((short)0, a.sh);
		assertEquals(167772392, a.i);
		assertEquals(0, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)-32640, -2139062177, -9187201950435737472L);
		a.Driver();
		assertEquals(32640, a.sh);
		assertEquals(2139062177, a.i);
		assertEquals(9187201950435737472L, a.l);
	}

}
