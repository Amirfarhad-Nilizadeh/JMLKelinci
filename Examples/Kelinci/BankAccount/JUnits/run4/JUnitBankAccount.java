
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
		int option = 1296576553;
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
	public void test2() {
		int result;
		int flag = 2;
		int option = -235802127;
		int amount = -235998735;
		int balance = -235802127;
		int previousTransaction = -235810319;
			
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
		int flag = 1;
		int option = 1298083881;
		int amount = 676154701;
		int balance = -2130706433;
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
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test4() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = 64511;
		int balance = 50331648;
		int previousTransaction = -65536;
			
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
		assertTrue("Balance is not correct", result == 64511);	
	}	

	@Test
	public void test5() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = 64511;
		int balance = 50331648;
		int previousTransaction = -65536;
			
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
		int flag = 0;
		int option = 3;
		int amount = 50529027;
		int balance = 50331648;
		int previousTransaction = 50529027;
			
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
	public void test7() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 469762048;
		int balance = 50331648;
		int previousTransaction = 256;
			
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
		assertTrue("Balance is not correct", result == 50331598);	
	}	

	@Test
	public void test8() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 64511;
		int balance = 50331648;
		int previousTransaction = -65536;
			
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
		assertTrue("Balance is not correct", result == 50267137);	
	}	

	@Test
	public void test9() {
		int result;
		int flag = 0;
		int option = 4;
		int amount = -458753;
		int balance = 50331648;
		int previousTransaction = -8454144;
			
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
	public void test10() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = 63999;
		int balance = 50331648;
		int previousTransaction = 436207616;
			
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
		assertTrue("Balance is not correct", result == 50267649);	
	}	

	@Test
	public void test11() {
		int result;
		int flag = 2;
		int option = 7;
		int amount = 200867839;
		int balance = 50331648;
		int previousTransaction = 16389;
			
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
		assertTrue("Balance is not correct", result == 241156097);	
	}	

	@Test
	public void test12() {
		int result;
		int flag = 0;
		int option = 8;
		int amount = 200867839;
		int balance = 50331648;
		int previousTransaction = 16389;
			
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
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test13() {
		int result;
		int flag = 0;
		int option = 5;
		int amount = 184549400;
		int balance = 64946176;
		int previousTransaction = 1;
			
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
	public void test14() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 184549400;
		int balance = 545238532;
		int previousTransaction = 1572864;
			
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
		assertTrue("Balance is not correct", result == 351461662);	
	}	

	@Test
	public void test15() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 200867839;
		int balance = 545238532;
		int previousTransaction = 1029;
			
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
		assertTrue("Balance is not correct", result == 21809540);	
	}	

	@Test
	public void test16() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = 512;
		int balance = 50331648;
		int previousTransaction = 16777216;
			
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
		assertTrue("Balance is not correct", result == 50331132);	
	}	

	@Test
	public void test17() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 200867839;
		int balance = 262144;
		int previousTransaction = 16389;
			
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
		assertTrue("Balance is not correct", result == 7863);	
	}	

	@Test
	public void test18() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 200802304;
		int balance = 131072;
		int previousTransaction = 16793605;
			
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
		assertTrue("Balance is not correct", result == 2620);	
	}		
}
