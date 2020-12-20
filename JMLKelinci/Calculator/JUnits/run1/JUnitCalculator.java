
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
		assertEquals(0, a.calculate(1243630422, 1263034922,'/'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(1244679243, a.calculate(1244679243, 1700876069,'%'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(-2142263569, a.calculate(5239295, -2147464432,'-'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(1159747115, a.calculate(435497771, 724249344,'+'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(5239311, -2147463904,'/'));
	}
}
