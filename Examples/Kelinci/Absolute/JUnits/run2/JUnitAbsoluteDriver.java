
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAbsoluteDriver {

	@Test
	public void test() {
		AbsoluteDriver a = new AbsoluteDriver((short)19021, 1280009580, 7597118924211093504L);
		a.Driver();
		assertEquals((short)19021, a.sh);
		assertEquals(1280009580, a.i);
		assertEquals(7597118924211093504L, a.l);
	}

	@Test
	public void test1() {
		AbsoluteDriver a = new AbsoluteDriver((short)-12337,-808464433 , -3472328296227680305L);
		a.Driver();
		assertEquals((short)12337, a.sh);
		assertEquals(808464433, a.i);
		assertEquals(3472328296227680305L, a.l);
	}

}
