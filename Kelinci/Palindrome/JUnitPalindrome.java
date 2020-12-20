
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPalindrome {

	@Test
	public void test() {
		Palindrome p = new Palindrome();
		boolean result = 			p.isPalindrome("{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V3$*{V");
		assertEquals(false, result);
	}

	@Test
	public void test1() {
		Palindrome p = new Palindrome();
		boolean result = p.isPalindrome("");
		assertEquals(true, result);
	}	
}
