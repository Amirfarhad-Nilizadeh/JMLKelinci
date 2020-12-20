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
		AbsoluteDriver a = new AbsoluteDriver((short)-1536, 1768515945, 7595718147998050665L);
		a.Driver();
		assertEquals((short)1536, a.sh);
		assertEquals(1768515945, a.i);
		assertEquals(7595718147998050665L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)19021, 1280009580, -9192265302254026752L);
		a.Driver();
		assertEquals((short)19021, a.sh);
		assertEquals(1280009580, a.i);
		assertEquals(9192265302254026752L, a.l);
	}

	@Test
	public void test3() {
		AbsoluteDriver a = new AbsoluteDriver((short)19455, -2139134389, -35895313744714394L);
		a.Driver();
		assertEquals((short)19455, a.sh);
		assertEquals(2139134389, a.i);
		assertEquals(35895313744714394L, a.l);
	}

}
