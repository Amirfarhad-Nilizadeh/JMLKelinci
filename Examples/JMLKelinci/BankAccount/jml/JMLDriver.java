public class JMLDriver {
	public static void main(String[] argv) 
	{
		int balance = Integer.parseInt(argv[0]);
		int option = Integer.parseInt(argv[1]);
		int amount = Integer.parseInt(argv[2]);
		int previousTransaction = Integer.parseInt(argv[3]);
		int flag = Integer.parseInt(argv[4]);
		
		try { 
			if (flag == 0) {
				BankAccount a = new BankAccount();
				a.menu(option, amount);	
			} else if (flag == 1) {	
				BankAccount b = new BankAccount(balance);
				b.menu(option, amount);	
			} else {
				BankAccount c = new BankAccount(balance, previousTransaction);
				c.menu(option, amount);	
	    		}
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

