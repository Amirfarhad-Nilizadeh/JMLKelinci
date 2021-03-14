
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
		AbsoluteDriver a = new AbsoluteDriver((short)12960, -8487298, 9121335702062039039L);
		a.Driver();
		assertEquals((short)12960, a.sh);
		assertEquals(8487298, a.i);
		assertEquals(9121335702062039039L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)-32268, 16816111, 6076657014715449344L);
		a.Driver();
		assertEquals((short)32268, a.sh);
		assertEquals(16816111, a.i);
		assertEquals(6076657014715449344L, a.l);
	}

	@Test
	public void test3() {
		AbsoluteDriver a = new AbsoluteDriver((short)19328, 196707, -8337755839351750656L);
		a.Driver();
		assertEquals((short)19328, a.sh);
		assertEquals(196707, a.i);
		assertEquals(8337755839351750656L, a.l);
	}

}
