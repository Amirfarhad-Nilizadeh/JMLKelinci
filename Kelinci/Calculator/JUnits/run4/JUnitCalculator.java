
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
		assertEquals(503316525, a.calculate(757935405, 254618880,'-'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(1502281626, a.calculate(256507908, 1245773718,'+'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(1246363652, 1782644630,'/'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(-8346277, a.calculate(-2147450752, 8388645,'%'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(-252, a.calculate(-2131722368, 8454016,'/'));
	}

	@Test
	public void test6() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(-2147450752, 7798834,'2'));
	}
}
