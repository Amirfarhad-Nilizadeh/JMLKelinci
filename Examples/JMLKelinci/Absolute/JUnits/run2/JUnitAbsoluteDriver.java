
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
		AbsoluteDriver a = new AbsoluteDriver((short)18944, -2139422868, 5153634653070125322L);
		a.Driver();
		assertEquals(18944, a.sh);
		assertEquals(2139422868, a.i);
		assertEquals(5153634653070125322L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)-5912, -387389208, -1663799682956001280L);
		a.Driver();
		assertEquals(5912, a.sh);
		assertEquals(387389208, a.i);
		assertEquals(1663799682956001280L, a.l);
	}

}
