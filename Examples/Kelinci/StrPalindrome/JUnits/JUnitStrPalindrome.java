
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitStrPalindrome {

	@Test
	public void test() {
		StrPalindrome p = new StrPalindrome();
		boolean result = 			p.isPalindrome("{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V");
		assertEquals(false, result);
	}

	@Test
	public void test1() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("");
		assertEquals(true, result);
	}	
}
