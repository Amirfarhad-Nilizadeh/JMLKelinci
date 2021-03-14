
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = false;
		int initialBalance = -202;
		boolean lateRegistration = true;
		int passedCredits = 64;
		int semesterCredits = 19;
		boolean debit = false;	
		int payment = 102834658;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -100778168);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 64);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = false;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 96;
		int semesterCredits = 12;
		boolean debit = true;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -555818742);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 96);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 22;
		int semesterCredits = 3;
		boolean debit = true;	
		int payment = 555819301;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 555);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 22);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = true;
		int initialBalance = -283;
		boolean lateRegistration = true;
		int passedCredits = 81;
		int semesterCredits = 20;
		boolean debit = true;	
		int payment = 473964833;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 3957);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 81);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

@Test
	public void test4() {
		int result;
		boolean option = true;
		int initialBalance = -1306;
		boolean lateRegistration = false;
		int passedCredits = 21;
		int semesterCredits = 12;
		boolean debit = false;	
		int payment = 555856596;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1094);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 21);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

}
