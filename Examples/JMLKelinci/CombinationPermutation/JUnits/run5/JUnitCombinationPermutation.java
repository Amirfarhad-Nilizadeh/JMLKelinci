import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitCombinationPermutation {

	@Test
	public void test() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(0,0,false) == 1);
	}

	@Test
	public void test1() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(0,0,true) == 1);
	}	

	@Test
	public void test2() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(16,0,true) == 1);
	}	

	@Test
	public void test3() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(8,0,false) == 1);
	}						
}
