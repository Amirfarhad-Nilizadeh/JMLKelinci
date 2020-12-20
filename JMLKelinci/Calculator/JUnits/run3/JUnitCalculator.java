
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitCalculator {

	@Test
	public void test() {
		Calculator a = new Calculator();
		assertEquals(-25, a.calculate(-556801, 37,'%'));
	}

	@Test
	public void test1() {
		Calculator a = new Calculator();
		assertEquals(1192704011, a.calculate(1596995640, 404291629,'-'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(-556776, 37,'.'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(-556801, 845316,'/'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(288639, a.calculate(-556801, 845440,'+'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(-20601637, a.calculate(-556801, 37,'*'));
	}
}
