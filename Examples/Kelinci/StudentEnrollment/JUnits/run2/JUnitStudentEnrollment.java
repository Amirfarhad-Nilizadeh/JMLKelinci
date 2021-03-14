
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = false;
		int initialBalance = -1591;
		boolean lateRegistration = true;
		int passedCredits = 27;
		int semesterCredits = 14;
		boolean debit = false;	
		int payment = 558040120;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -546880909);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 27);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = false;
		int initialBalance = 555;
		boolean lateRegistration = false;
		int passedCredits = 110;
		int semesterCredits = 6;
		boolean debit = true;	
		int payment = 555816993;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -555816438);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 110);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 32;
		int semesterCredits = 15;
		boolean debit = false;	
		int payment = 570425216;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 3180);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 32);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 97;
		int semesterCredits = 12;
		boolean debit = true;	
		int payment = 553648128;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2400);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 97);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

}
