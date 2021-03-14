
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
		AbsoluteDriver a = new AbsoluteDriver((short)77, -8428180, 7597118924211093504L);
		a.Driver();
		assertEquals(77, a.sh);
		assertEquals(8428180, a.i);
		assertEquals(7597118924211093504L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)-12851, -842150451, -40978347227873280L);
		a.Driver();
		assertEquals(12851, a.sh);
		assertEquals(842150451, a.i);
		assertEquals(40978347227873280L, a.l);
	}
}
