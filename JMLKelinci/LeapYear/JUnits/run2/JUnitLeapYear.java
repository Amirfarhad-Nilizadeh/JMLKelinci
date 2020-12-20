
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitLeapYear {

	@Test
	public void test() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (1246579787));
	}

	@Test
	public void test1() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (1280009472));
	}

	@Test
	public void test2() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (33587200));
	}

	@Test
	public void test3() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (976894500));
	}
}
