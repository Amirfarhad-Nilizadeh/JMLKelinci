
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitCalculator {

	@Test
	public void test() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(1246623051, 1707756327,'\''));
	}
	
	@Test
	public void test1() {
		Calculator a = new Calculator();
		assertEquals(8388608, a.calculate(8388608, 336860171,'%'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(-461176034, a.calculate(1246579787, 1707755821,'-'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(15, a.calculate(1112405248, 73681711,'/'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(1186087083, a.calculate(1112405376, 73681707,'+'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(-1643029400, a.calculate(100, -16430294,'*'));
	}
}
