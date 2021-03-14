
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = false;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 58;
		int semesterCredits = 17;
		boolean debit = false;	
		int payment = 555819496;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -544703108);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 58);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = true;
		int initialBalance = -8;
		boolean lateRegistration = true;
		int passedCredits = 110;
		int semesterCredits = 4;
		boolean debit = true;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 840);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 110);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = 2130;
		boolean lateRegistration = false;
		int passedCredits = 55;
		int semesterCredits = 13;
		boolean debit = true;	
		int payment = 555820321;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2130);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 55);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	
}
