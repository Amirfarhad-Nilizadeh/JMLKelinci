
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = true;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 2;
		int semesterCredits = 5;
		boolean debit = true;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 555);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 2);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = false;
		int initialBalance = -146;
		boolean lateRegistration = false;
		int passedCredits = 27;
		int semesterCredits = 10;
		boolean debit = false;	
		int payment = 168430333;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -165061873);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 27);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = false;
		int initialBalance = 555;
		boolean lateRegistration = false;
		int passedCredits = 14;
		int semesterCredits = 5;
		boolean debit = true;	
		int payment = 553680929;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -553680374);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 14);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = true;
		int initialBalance = -8;
		boolean lateRegistration = true;
		int passedCredits = 24;
		int semesterCredits = 12;
		boolean debit = true;	
		int payment = 2132934655;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2536);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 24);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test4() {
		int result;
		boolean option = true;
		int initialBalance = -36;
		boolean lateRegistration = false;
		int passedCredits = 63;
		int semesterCredits = 17;
		boolean debit = false;	
		int payment = 239888127;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 3364);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 63);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

}
