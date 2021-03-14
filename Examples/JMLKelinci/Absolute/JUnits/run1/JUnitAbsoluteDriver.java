
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
		AbsoluteDriver a = new AbsoluteDriver((short)19021, -162829207, 7953753874257412096L);
		a.Driver();
		assertEquals(19021, a.sh);
		assertEquals(162829207, a.i);
		assertEquals(7953753874257412096L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)-20492, -185273104, -866238189650575360L);
		a.Driver();
		assertEquals(20492, a.sh);
		assertEquals(185273104, a.i);
		assertEquals(866238189650575360L, a.l);
	}

}
