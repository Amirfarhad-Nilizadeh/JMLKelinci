
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = true;
		int initialBalance = 1679;
		boolean lateRegistration = true;
		int passedCredits = 87;
		int semesterCredits = 2;
		boolean debit = true;	
		int payment = 562045381;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1679);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 87);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = false;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 82;
		int semesterCredits = 17;
		boolean debit = false;	
		int payment = 2129719424;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -2087125036);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 82);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 41;
		int semesterCredits = 19;
		boolean debit = true;	
		int payment = 505492961;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 3800);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 41);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	
}
