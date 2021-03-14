
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitCalculator {

	@Test
	public void test() {
		Calculator a = new Calculator();
		assertEquals(-1479743489, a.calculate(-1488176385, -8432896,'-'));
	}
	
	@Test
	public void test1() {
		Calculator a = new Calculator();
		assertEquals(176, a.calculate(-1489683904, -8432896,'/'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(-1162870720, -7589120,'.'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(2813482, a.calculate(-4609, 2818091,'+'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(-4609, a.calculate(-4609, 2818085,'%'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(4194346, a.calculate(1, 4194346,'*'));
	}
}
