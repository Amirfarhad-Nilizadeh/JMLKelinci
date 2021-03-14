
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
		assertEquals(true, year.isLeapYear (536870912));
	}

	@Test
	public void test2() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (1677721600));
	}

	@Test
	public void test3() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (1246579800));
	}
}
