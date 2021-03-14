
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = true;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 9;
		int semesterCredits = 12;
		boolean debit = true;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 555);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 9);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = false;
		int initialBalance = -16;
		boolean lateRegistration = true;
		int passedCredits = 10;
		int semesterCredits = 9;
		boolean debit = true;	
		int payment = 263679;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -263695);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 10);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = -16;
		boolean lateRegistration = true;
		int passedCredits = 47;
		int semesterCredits = 1;
		boolean debit = false;	
		int payment = 562102271;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 196);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 47);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

}
