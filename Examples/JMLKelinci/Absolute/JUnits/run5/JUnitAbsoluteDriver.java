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
		AbsoluteDriver a = new AbsoluteDriver((short)9217, -1278489653, -3765629637267174453L);
		a.Driver();
		assertEquals((short)9217, a.sh);
		assertEquals(1278489653, a.i);
		assertEquals(3765629637267174453L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)-5655, -385810199, -1482137924316168192L);
		a.Driver();
		assertEquals((short)5655, a.sh);
		assertEquals(385810199, a.i);
		assertEquals(1482137924316168192L, a.l);
	}

}
