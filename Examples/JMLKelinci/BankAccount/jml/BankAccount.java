public class BankAccount {
        int balance;
	int previousTransaction;
        //@ invariant 0 <= balance;

	BankAccount()
	{
		balance = 0;
		previousTransaction = 0;
	}

	BankAccount(int currentBalance)
	{
		if (currentBalance <= 0){
			balance = 0;
		} else {		
			balance = currentBalance;
		}
		previousTransaction = 0;
	}

	BankAccount(int currentBalance, int _previousTransaction)
	{
		if (currentBalance <= 0){
			balance = 0;
		} else {		
			balance = currentBalance;
		}
		previousTransaction = _previousTransaction;
	}

	/*@ spec_public pure @*/ boolean isValid(int _amount)
	{
		if (0 < _amount) {
			return true;
		} else {
			return false;
		}
	}

	/*@ spec_public pure @*/ boolean isValid(int _balance, int _amount)
	{
		if (0 <= _balance - _amount) {
			return true;
		} else {
			return false;
		}
	}
	     
	    	/*@ 	requires option == 0;
		also
			requires option == 1 && isValid(amount);
	  		requires amount + balance <= Integer.MAX_VALUE;
	 	also
	   		requires option == 2 && isValid(amount);
	   		requires isValid(balance, amount);
	 	also
	 		requires option == 3 && isValid(amount);
		also 
			requires option == 4;
	 	also
	 		old int _amount =  amount + (amount/100)*5;
	 		requires option == 5;
			requires _amount <= Integer.MAX_VALUE;
	   		requires isValid(_amount);
	 	also
	 		old int _amount =  amount - (amount/100)*2;
	   		requires option == 6 && isValid(_amount);
	 	also
			old int _amount =  amount - (amount/100)*5;
	 		requires option == 7 && isValid(_amount);
	   		requires _amount + balance <= Integer.MAX_VALUE;
		also
			requires option == 8;
	 	also
			requires option == 9;
			old int ATMpenalty = 4;
			requires amount + ATMpenalty <= Integer.MAX_VALUE;
			requires isValid(amount);
			requires isValid(balance, (amount + ATMpenalty));
	     @*/ 
	int menu(int option, int amount) { return 0; }
}
