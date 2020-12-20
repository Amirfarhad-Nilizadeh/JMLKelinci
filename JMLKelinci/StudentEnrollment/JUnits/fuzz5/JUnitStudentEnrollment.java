
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = true;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 38;
		int semesterCredits = 8;
		boolean debit = true;	
		int payment = 102826017;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 555);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 38);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 72;
		int semesterCredits = 11;
		boolean debit = true;	
		int payment = 555819392;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2332);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 72);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = false;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 27;
		int semesterCredits = 3;
		boolean debit = true;	
		int payment = 958472681;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -958472126);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 27);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 75;
		int semesterCredits = 1;
		boolean debit = true;	
		int payment = 553650816;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 200);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 75);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	


	@Test
	public void test4() {
		int result;
		boolean option = false;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 8;
		int semesterCredits = 4;
		boolean debit = false;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -544702358);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 8);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

}
