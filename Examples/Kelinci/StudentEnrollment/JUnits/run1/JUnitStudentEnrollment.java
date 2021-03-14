
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = true;
		int initialBalance = 557;
		boolean lateRegistration = true;
		int passedCredits = 19;
		int semesterCredits = 2;
		boolean debit = true;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 557);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 19);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = false;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 49;
		int semesterCredits = 5;
		boolean debit = false;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -544702358);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 49);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 110;
		int semesterCredits = 0;
		boolean debit = true;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 555);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 110);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = false;
		int initialBalance = 561;
		boolean lateRegistration = true;
		int passedCredits = 49;
		int semesterCredits = 20;
		boolean debit = true;	
		int payment = 555821304;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -555820743);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 49);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test4() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 110;
		int semesterCredits = 4;
		boolean debit = true;	
		int payment = 1679892769;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 848);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 110);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

}
