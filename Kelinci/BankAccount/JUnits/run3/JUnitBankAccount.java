
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
		int flag = 2;
		int option = -1381126739;
		int amount = -1381169075;
		int balance = 557886893;
		int previousTransaction = 1297756201;
	
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
		assertTrue("Balance is not correct", result == 557886893);	
	}

	@Test
	public void test2() {
		int result;
		int flag = 0;
		int option = 1298083888;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 1306134861;
			
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
	public void test3() {
		int result;
		int flag = 2;
		int option = -1970635154;
		int amount = -91583862;
		int balance = -1953854838;
		int previousTransaction = -1970635154;
			
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
		int flag = 1;
		int option = 1077952576;
		int amount = 1077952576;
		int balance = -1910751199;
		int previousTransaction = 1077952576;
			
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
		int option = 1;
		int amount = 436273409;
		int balance = 268501348;
		int previousTransaction = 16843249;
			
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
		assertTrue("Balance is not correct", result == 436273409);	
	}	

	@Test
	public void test6() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 58723073;
		int balance = 557842788;
		int previousTransaction = 16878079;
			
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
		assertTrue("Balance is not correct", result == 499119715);	
	}	

	@Test
	public void test7() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = -562036468;
		int balance = -8453887;
		int previousTransaction = 16868099;
			
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
	public void test8() {
		int result;
		int flag = 2;
		int option = 4;
		int amount = -562036479;
		int balance = 1090909440;
		int previousTransaction = 16868099;
			
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
		assertTrue("Balance is not correct", result == 16868099);	
	}	

	@Test
	public void test9() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = -562036479;
		int balance = 65793;
		int previousTransaction = 16875775;
			
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
		assertTrue("Balance is not correct", result == 1314);	
	}

	@Test
	public void test10() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 176226561;
		int balance = 20971876;
		int previousTransaction = 16875775;
			
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
	public void test11() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = 67840;
		int balance = 16711936;
		int previousTransaction = -526621949;
			
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
	public void test12() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 176226561;
		int balance = 20971876;
		int previousTransaction = 16875775;
			
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
		assertTrue("Balance is not correct", result == 20971826);	
	}	

	@Test
	public void test13() {
		int result;
		int flag = 1;
		int option = 7;
		int amount = 1048576;
		int balance = 2130772225;
		int previousTransaction = 31744515;
			
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
		assertTrue("Balance is not correct", result == 2131768376);	
	}	

	@Test
	public void test14() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 58723073;
		int balance = 2130772225;
		int previousTransaction = 16878079;
			
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
		assertTrue("Balance is not correct", result == 2072049152);	
	}	

	@Test
	public void test15() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 1048576;
		int balance = 2130772224;
		int previousTransaction = 96515;
			
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
		assertTrue("Balance is not correct", result == 2129671223);	
	}	

	@Test
	public void test16() {
		int result;
		int flag = 0;
		int option = 5;
		int amount = 1048576;
		int balance = 2130772225;
		int previousTransaction = 3;
			
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
	public void test17() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = 16843009;
		int balance = 557842788;
		int previousTransaction = -2130706433;
			
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
		assertTrue("Balance is not correct", result == 540999775);	
	}	

	@Test
	public void test18() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = 67855;
		int balance = 2130772225;
		int previousTransaction = -526620925;
			
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
		assertTrue("Balance is not correct", result == 2130705726);	
	}	

	@Test
	public void test19() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = -562036479;
		int balance = 196865;
		int previousTransaction = 16875537;
			
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
		assertTrue("Balance is not correct", result == 5904);	
	}	

	@Test
	public void test20() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = -562036479;
		int balance = 16843009;
		int previousTransaction = 16868099;
			
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
		assertTrue("Balance is not correct", result == 673720);	
	}			
}
