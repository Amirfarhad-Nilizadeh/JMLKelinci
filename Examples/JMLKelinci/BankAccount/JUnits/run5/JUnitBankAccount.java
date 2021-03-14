
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitBankAccount {

	@Test
	public void test() {
		int result;
		int flag = 1;
		int option = 0;	
		int amount = 0;
		int balance = 128;
		int previousTransaction = 10616832;
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
	public void test1() {
		int result;
		int flag = 2;
		int option = 0;
		int amount = 436273402;
		int balance = 557844864;
		int previousTransaction = 978135104;
	
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
		assertTrue("Balance is not correct", result == 557844864);	
	}

	@Test
	public void test2() {
		int result;
		int flag = 0;
		int option = 0;
		int amount = 0;
		int balance = 557844864;
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
	public void test3() {
		int result;
		int flag = 1;
		int option = 0;
		int amount = 15597328;
		int balance = -301989760;
		int previousTransaction = 10618112;
			
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
		int option = 6;
		int amount = 8319;
		int balance = -217;
		int previousTransaction = 8388608;
			
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
		int flag = 2;
		int option = 0;
		int amount = 0;
		int balance = -67108995;
		int previousTransaction = 117482042;
			
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
		int option = 1;
		int amount = 219217919;
		int balance = -721920;
		int previousTransaction = 2139029604;
			
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
		assertTrue("Balance is not correct", result == 219217919);	
	}	

	@Test
	public void test7() {
		int result;
		int flag = 0;
		int option = 4;
		int amount = 15597348;
		int balance = 384;
		int previousTransaction = 1048576;
			
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
		int option = 5;
		int amount = 436273402;
		int balance = 541067648;
		int previousTransaction = 978135104;
			
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
		assertTrue("Balance is not correct", result == 82980576);	
	}	

	@Test
	public void test9() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 16843002;
		int balance = 559352192;
		int previousTransaction = 978135118;
			
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
		assertTrue("Balance is not correct", result == 542509190);	
	}

	@Test
	public void test10() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 219217919;
		int balance = -721920;
		int previousTransaction = 2139029623;
			
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
		int option = 5;
		int amount = 436273402;
		int balance = -32769;
		int previousTransaction = 978135104;
			
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
		int flag = 1;
		int option = 7;
		int amount = 10631757;
		int balance = -721920;
		int previousTransaction = 671184512;
			
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
		assertTrue("Balance is not correct", result == 10100172);	
	}	

	@Test
	public void test13() {
		int result;
		int flag = 0;
		int option = 8;
		int amount = 0;
		int balance = 557844864;
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
	public void test14() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = 8319;
		int balance = 557907751;
		int previousTransaction = 8388608;
			
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
		assertTrue("Balance is not correct", result == 557899598);	
	}	

	@Test
	public void test15() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 219152503;
		int balance = 16055296;
		int previousTransaction = -8386049;
			
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
		assertTrue("Balance is not correct", result == 16055246);	
	}	

	@Test
	public void test16() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 1540211;
		int balance = 16054784;
		int previousTransaction = -6223361;
			
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
		assertTrue("Balance is not correct", result == 14514573);	
	}	

	@Test
	public void test17() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 0;
		int balance = 8453120;
		int previousTransaction = 16202317;
			
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
		assertTrue("Balance is not correct", result == 338124);	
	}	

	@Test
	public void test18() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 127;
		int balance = 64512;
		int previousTransaction = 77;
			
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
		assertTrue("Balance is not correct", result == 1290);	
	}	

	@Test
	public void test19() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 32;
		int balance = 8436736;
		int previousTransaction = 16202317;
			
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
		assertTrue("Balance is not correct", result == 8436700);	
	}	

	@Test
	public void test20() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 127;
		int balance = 195584;
		int previousTransaction = 77;
			
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
		assertTrue("Balance is not correct", result == 5865);	
	}			
}
