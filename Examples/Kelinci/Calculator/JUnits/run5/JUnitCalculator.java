
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
		assertEquals(-41579, a.calculate(-41579, 2066295040,'%'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(16789504, -1878589185,'/'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(1912028016, a.calculate(33438720, -1878589296,'-'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(-1861799904, a.calculate(16789504, -1878589408,'+'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(16789504, 65536,'⸮'));
	}

	@Test
	public void test6() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(388103685, -65534,'缂'));
	}
}
