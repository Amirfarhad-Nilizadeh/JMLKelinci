
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = false;
		int initialBalance = 539;
		boolean lateRegistration = true;
		int passedCredits = 1;
		int semesterCredits = 3;
		boolean debit = false;	
		int payment = 555843584;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -544726175);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 1);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = true;
		int initialBalance = 1465;
		boolean lateRegistration = true;
		int passedCredits = 14;
		int semesterCredits = 3;
		boolean debit = true;	
		int payment = 1465341783;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1465);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 14);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = -585;
		boolean lateRegistration = true;
		int passedCredits = 90;
		int semesterCredits = 12;
		boolean debit = true;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1959);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 90);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = false;
		int initialBalance = 555;
		boolean lateRegistration = true;
		int passedCredits = 31;
		int semesterCredits = 8;
		boolean debit = true;	
		int payment = 555819297;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -555818742);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 31);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	


	@Test
	public void test4() {
		int result;
		boolean option = true;
		int initialBalance = -1585;
		boolean lateRegistration = false;
		int passedCredits = 110;
		int semesterCredits = 4;
		boolean debit = false;	
		int payment = 555811082;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -785);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 110);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

}
