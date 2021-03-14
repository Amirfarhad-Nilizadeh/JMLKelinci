import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitCombinationPermutation {

	@Test
	public void test() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(0,0,true) == 1);
	}						
}
