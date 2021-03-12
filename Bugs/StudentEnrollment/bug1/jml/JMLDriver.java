public class JMLDriver {
	public static void main(String[] argv) 
	{
		boolean lateRegistration = true;
		boolean debit = true;
		boolean option = true;
		int passedCredits = Integer.parseInt(argv[0]);
		int enrollmentCredits = Integer.parseInt(argv[1]);
		int payment = Integer.parseInt(argv[2]);
		int initialBalance = Integer.parseInt(argv[3]);
		int intLateRegistration = Integer.parseInt(argv[4]);
		int intDebit = Integer.parseInt(argv[5]);
		int intOption = Integer.parseInt(argv[6]);

		if (intLateRegistration%2 == 0)
			lateRegistration = false;
		if (intDebit%2 == 0)
			 debit = false;
		if (intOption%2 == 0)
			 option = false;
		try { 
			StudentEnrollment a = new StudentEnrollment("AnyFirstName", "AnyLastName");
			a.enrollmentProcess(passedCredits, enrollmentCredits, payment, initialBalance, lateRegistration, debit, option);	
		} catch (IllegalArgumentException e) {
			System.err.println("JMLDriver");
		} 
	}
}

