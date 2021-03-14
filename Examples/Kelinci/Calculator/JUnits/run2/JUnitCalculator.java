
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitCalculator {

	@Test
	public void test() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(1246579787, 1701603694,'੮'));
	}
	
	@Test
	public void test1() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(738533376, -1292226772,'/'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(2030760148, a.calculate(738533376, -1292226772,'-'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(738533376, a.calculate(738533376, -1292226772,'%'));
	}


	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(738533376, -1292226772,'/'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(738525184, -2134624060,'쓕'));
	}
}
