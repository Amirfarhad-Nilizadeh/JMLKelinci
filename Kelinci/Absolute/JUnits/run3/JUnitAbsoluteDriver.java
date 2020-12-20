
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
		AbsoluteDriver a = new AbsoluteDriver((short)22207, 151587081, 651061525477919035L);
		a.Driver();
		assertEquals((short)22207, a.sh);
		assertEquals(151587081, a.i);
		assertEquals(651061525477919035L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)14669, 805372077, -3149278383192382359L);
		a.Driver();
		assertEquals((short)14669, a.sh);
		assertEquals(805372077, a.i);
		assertEquals(3149278383192382359L, a.l);
	}

	@Test
	public void test3() {
		AbsoluteDriver a = new AbsoluteDriver((short)-26215, -1727721472, -3457357138936987648L);
		a.Driver();
		assertEquals((short)26215, a.sh);
		assertEquals(1727721472, a.i);
		assertEquals(3457357138936987648L, a.l);
	}

}
