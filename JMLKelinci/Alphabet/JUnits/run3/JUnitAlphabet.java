
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAlphabet {

	@Test
	public void test() {
		int option = 0;
		int c = 127;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test1() {
		int option = 1;
		int c = 1;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test2() {
		int option = 2;
		int c = 17733;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test3() {
		int option = 4;
		int c = 383;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test4() {
		int option = 1;
		int c = 65535;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test5() {
		int option = 4;
		int c = 4;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test6() {
		int option = 2;
		int c = 4;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test7() {
		int option = 3;
		int c = 65409;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test8() {
		int option = 3;
		int c = 0;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test9() {
		int option = 0;
		int c = 69;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test10() {
		int option = 2;
		int c = 105;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test11() {
		int option = 4;
		int c = 69;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test12() {
		int option = 4;
		int c = 105;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test13() {
		int option = 1;
		int c = 69;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test14() {
		int option = 3;
		int c = 55;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}
}
