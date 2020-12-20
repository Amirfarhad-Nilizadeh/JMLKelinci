
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
		assertEquals(2, a.calculate(1448815409, 723339347,'/'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(623895208, a.calculate(1448815403, 824920195,'-'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(623895238, a.calculate(1448815385, 824920147,'%'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(1684300888, 1684300900,'摤'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(555819297, 555819297,'℡'));
	}
}
