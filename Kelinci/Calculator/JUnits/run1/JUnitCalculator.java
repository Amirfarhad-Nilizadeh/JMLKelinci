
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
		assertEquals(1233221386, a.calculate(1246579789, -13358403,'+'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(1246625663, a.calculate(1246625663, 1701604351,'%'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(65332, -2011878812,'㒈'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(872382464, a.calculate(872415232, 32768,'-'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(67145728, 536903680,'/'));
	}

	@Test
	public void test6() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(67145728, 32768,'ú'));
	}
}
