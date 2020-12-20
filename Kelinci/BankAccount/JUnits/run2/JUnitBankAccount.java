
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitBankAccount {

	@Test
	public void test() {
		int result;
		int option = 1298083881;
		int flag = 1;	
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 1296911693;
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 557844813);	
	}	

	@Test
	public void test1() {
		int result;
		int flag = 0;
		int option = 390072608;
		int amount = 1298082637;
		int balance = 390072608;
		int previousTransaction = 1596660021;
	
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test2() {
		int result;
		int flag = 2;
		int option = 1298083881;
		int amount = 676154677;
		int balance = 557844813;
		int previousTransaction = 1296911693;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 557844813);	
	}	

	@Test
	public void test3() {
		int result;
		int flag = 1;
		int option = 1596926248;
		int amount = 1299017549;
		int balance = -1593226681;
		int previousTransaction = 1296911666;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test4() {
		int result;
		int flag = 2;
		int option = -1549556859;
		int amount = -1549556829;
		int balance = -186384477;
		int previousTransaction = -168097627;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test5() {
		int result;
		int flag = 0;
		int option = 8;
		int amount = 134744319;
		int balance = 1296911743;
		int previousTransaction = -255;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test6() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 134744319;
		int balance = 1294945663;
		int previousTransaction = -255;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 51797824);	
	}	

	@Test
	public void test7() {
		int result;
		int flag = 2;
		int option = 7;
		int amount = 134744319;
		int balance = 1294945671;
		int previousTransaction = -255;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 1422952775);	
	}	

	@Test
	public void test8() {
		int result;
		int flag = 1;
		int option = 4;
		int amount = 134744192;
		int balance = 1294945663;
		int previousTransaction = 134776833;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test9() {
		int result;
		int flag = 1;
		int option = 1;
		int amount = 269488144;
		int balance = -2146430960;
		int previousTransaction = 269488120;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 269488144);	
	}

	@Test
	public void test10() {
		int result;
		int flag = 2;
		int option = 5;
		int amount = -2130770433;
		int balance = 1294945684;
		int previousTransaction = -255;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 1294945684);	
	}	

	@Test
	public void test11() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = 301925887;
		int balance = 1294945670;
		int previousTransaction = -255;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 999058299);	
	}	

	@Test
	public void test12() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 387383296;
		int balance = 1294945670;
		int previousTransaction = 5111807;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);;	
		}
		assertTrue("Balance is not correct", result == 888193214);	
	}	

	@Test
	public void test13() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = 285212804;
		int balance = 128;
		int previousTransaction = -256;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
		}
		assertTrue("Balance is not correct", result == 128);	
	}	

	@Test
	public void test14() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 1298082638;
		int balance = 1291878279;
		int previousTransaction = 1596660029;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test15() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 10756;
		int balance = 1296929792;
		int previousTransaction = -1543498025;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 1296919036);	
	}	

	@Test
	public void test16() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 1298082638;
		int balance = 1291878279;
		int previousTransaction = 1596653568;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 1291878229);	
	}	

	@Test
	public void test17() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 1298082638;
		int balance = 1307016839;
		int previousTransaction = 1596660029;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 8934201);	
	}	

	@Test
	public void test18() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 134807294;
		int balance = 1294945671;
		int previousTransaction = -16711680;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 1160138373);	
	}	

	@Test
	public void test19() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 134774527;
		int balance = 131200;
		int previousTransaction = -16711660;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 2624);	
	}	

	@Test
	public void test20() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 134774527;
		int balance = 195968;
		int previousTransaction = -16711660;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);	
		}
		assertTrue("Balance is not correct", result == 5877);	
	}			
}
