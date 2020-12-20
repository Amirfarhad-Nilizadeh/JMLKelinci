
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitBankAccount {

	@Test
	public void test() {
		int result;
		int flag = 0;
		int option = 0;	
		int amount = 0;
		int balance = 553650432;
		int previousTransaction = 0;
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
	public void test1() {
		int result;
		int flag = 2;
		int option = 0;
		int amount = 63232;
		int balance = 557844736;
		int previousTransaction = 0;
	
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
		assertTrue("Balance is not correct", result == 557844736);	
	}

	@Test
	public void test2() {
		int result;
		int flag = 1;
		int option = 0;
		int amount = -380875470;
		int balance = 822083584;
		int previousTransaction = 1078800977;
			
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
		assertTrue("Balance is not correct", result == 822083584);	
	}	

	@Test
	public void test3() {
		int result;
		int flag = 2;
		int option = 0;
		int amount = 0;
		int balance = 0;
		int previousTransaction = 0;
			
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
		int option = 3;
		int amount = 5632;
		int balance = 569583872;
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
		assertTrue("Balance is not correct", result == 569578240);	
	}	

	@Test
	public void test5() {
		int result;
		int flag = 0;
		int option = 5;
		int amount = 2048;
		int balance = 554764544;
		int previousTransaction = 0;
			
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
		int flag = 1;
		int option = 4;
		int amount = 16777216;
		int balance = 553652480;
		int previousTransaction = -1638400;
			
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
		int flag = 1;
		int option = 0;
		int amount = 0;
		int balance = -63232;
		int previousTransaction = 0;
			
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
		int option = 3;
		int amount = 16773376;
		int balance = 16743012;
		int previousTransaction = 2293760;
			
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
		assertTrue("Balance is not correct", result == 16742962);	
	}	

	@Test
	public void test9() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = 16777216;
		int balance = 553652480;
		int previousTransaction = -8388608;
			
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
		assertTrue("Balance is not correct", result == 536875264);	
	}

	@Test
	public void test10() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 16777216;
		int balance = -687861504;
		int previousTransaction = 255;
			
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
		int flag = 2;
		int option = 8;
		int amount = 458752;
		int balance = 62464;
		int previousTransaction = 0;
			
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
		assertTrue("Balance is not correct", result == 1248);	
	}	

	@Test
	public void test12() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 19762;
		int balance = 587204864;
		int previousTransaction = 1078800977;
			
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
		assertTrue("Balance is not correct", result == 23488192);	
	}	

	@Test
	public void test13() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 33023;
		int balance = 569583872;
		int previousTransaction = 201457665;
			
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
		int amount = 234883072;
		int balance = 554822656;
		int previousTransaction = 255;
			
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
		assertTrue("Balance is not correct", result == 308195434);	
	}	

	@Test
	public void test15() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = 50364493;
		int balance = 401811712;
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
		assertTrue("Balance is not correct", result == 352454507);	
	}	

	@Test
	public void test16() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = 66779898;
		int balance = 569578496;
		int previousTransaction = -84215046;
			
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
		int flag = 0;
		int option = 1;
		int amount = 2048;
		int balance = 557844736;
		int previousTransaction = 0;
			
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
		assertTrue("Balance is not correct", result == 2048);	
	}	

	@Test
	public void test18() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 32768;
		int balance = 569583872;
		int previousTransaction = 255;
			
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
		assertTrue("Balance is not correct", result == 569551100);	
	}	

	@Test
	public void test19() {
		int result;
		int flag = 1;
		int option = 7;
		int amount = 50364493;
		int balance = 401811712;
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
		assertTrue("Balance is not correct", result == 449657985);	
	}	

	@Test
	public void test20() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 521984;
		int balance = 193536;
		int previousTransaction = 0;
			
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
		assertTrue("Balance is not correct", result == 5805);	
	}			
}
