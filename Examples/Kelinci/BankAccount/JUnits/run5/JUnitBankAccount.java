
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
		int option = 16777001;
		int amount = 676154701;
		int balance = 557844991;
		int previousTransaction = 1295797581;
	
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
		int option = -4605441;
		int amount = -32839;
		int balance = -1179010631;
		int previousTransaction = -1179010631;
			
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
		int option = 1296911693;
		int amount = 843402573;
		int balance = 557844782;
		int previousTransaction = 1296911684;
			
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
		assertTrue("Balance is not correct", result == 557844782);	
	}

	@Test
	public void test4() {
		int result;
		int flag = 1;
		int option = 1682964320;
		int amount = -2147277724;
		int balance = -2139094236;
		int previousTransaction = 1342177279;
			
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
		int option = 4;
		int amount = 2056;
		int balance = -8453888;
		int previousTransaction = 134744072;
			
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
		assertTrue("Balance is not correct", result == 134744072);	
	}	

	@Test
	public void test6() {
		int result;
		int flag = 0;
		int option = 8;
		int amount = 537397256;
		int balance = -7995136;
		int previousTransaction = 134744108;
			
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
		int option = 2;
		int amount = 2056;
		int balance = 293536000;
		int previousTransaction = 134744072;
			
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
		assertTrue("Balance is not correct", result == 293533944);	
	}	

	@Test
	public void test8() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 134744072;
		int balance = 65536;
		int previousTransaction = 134756360;
			
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
		assertTrue("Balance is not correct", result == 1310);	
	}	

	@Test
	public void test9() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 520029540;
		int balance = 377422080;
		int previousTransaction = 1845493759;
			
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
		assertTrue("Balance is not correct", result == 377422080);	
	}

	@Test
	public void test10() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = 570357249;
		int balance = -8453888;
		int previousTransaction = 1845428288;
			
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
		int option = 1;
		int amount = 1024;
		int balance = -8453888;
		int previousTransaction = 526344;
			
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
		assertTrue("Balance is not correct", result == 1024);	
	}	

	@Test
	public void test12() {
		int result;
		int flag = 2;
		int option = 5;
		int amount = 84215045;
		int balance = 377425920;
		int previousTransaction = 84215045;
			
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
		assertTrue("Balance is not correct", result == 289000125);	
	}	

	@Test
	public void test13() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = 134744072;
		int balance = 377422080;
		int previousTransaction = 134744072;
			
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
		assertTrue("Balance is not correct", result == 242678004);	
	}	

	@Test
	public void test14() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 134744072;
		int balance = 377422080;
		int previousTransaction = 134744072;
			
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
		assertTrue("Balance is not correct", result == 15096880);	
	}	

	@Test
	public void test15() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 570357249;
		int balance = -8453888;
		int previousTransaction = 1838219328;
			
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
	public void test16() {
		int result;
		int flag = 1;
		int option = 7;
		int amount = 570357494;
		int balance = -8453888;
		int previousTransaction = -151587082;
			
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
		assertTrue("Balance is not correct", result == 541839624);	
	}	

	@Test
	public void test17() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = 570357249;
		int balance = 2147418368;
		int previousTransaction = 1842413632;
			
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
		assertTrue("Balance is not correct", result == 1588468263);	
	}	

	@Test
	public void test18() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 369118571;
		int balance = 293536000;
		int previousTransaction = 844245546;
			
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
		assertTrue("Balance is not correct", result == 293535950);	
	}	

	@Test
	public void test19() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 369118565;
		int balance = 2147418368;
		int previousTransaction = 844234752;
			
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
		assertTrue("Balance is not correct", result == 1778299803);	
	}	

	@Test
	public void test20() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 140834305;
		int balance = 196608;
		int previousTransaction = 1838219328;
			
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
		assertTrue("Balance is not correct", result == 5898);	
	}			
}
