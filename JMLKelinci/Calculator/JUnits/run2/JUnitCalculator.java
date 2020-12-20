
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitCalculator {

	@Test
	public void test() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(1244482635, 1744863360,'&'));
	}
	
	@Test
	public void test1() {
		Calculator a = new Calculator();
		assertEquals(-784806965, a.calculate(960056395, 1744863360,'-'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(100, a.calculate(960056420, 128,'%'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(7487489, a.calculate(958398719, 128,'/'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(974846592, a.calculate(958462464, 16384128,'+'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(960056420, 0,'*'));
	}
}
