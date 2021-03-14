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
		AbsoluteDriver a = new AbsoluteDriver((short)-14136, -926365496, -3978709506094217016L);
		a.Driver();
		assertEquals((short)14136, a.sh);
		assertEquals(926365496, a.i);
		assertEquals(3978709506094217016L, a.l);
	}



}
