import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = true;
		int initialBalance = 136;
		boolean lateRegistration = true;
		int passedCredits = 16;
		int semesterCredits = 4;
		boolean debit = true;	
		int payment = 555870187;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 136);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 16);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = true;
		int initialBalance = -1591;
		boolean lateRegistration = true;
		int passedCredits = 110;
		int semesterCredits = 2;
		boolean debit = true;	
		int payment = 554901793;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1167);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 110);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = false;
		int initialBalance = 562;
		boolean lateRegistration = false;
		int passedCredits = 9;
		int semesterCredits = 12;
		boolean debit = true;	
		int payment = 1481449761;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1481449199);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 9);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = false;
		int initialBalance = 1616;
		boolean lateRegistration = false;
		int passedCredits = 93;
		int semesterCredits = 12;
		boolean debit = false;	
		int payment = 1616928864;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1584588672);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 93);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	


	@Test
	public void test4() {
		int result;
		boolean option = true;
		int initialBalance = -2145;
		boolean lateRegistration = false;
		int passedCredits = 27;
		int semesterCredits = 12;
		boolean debit = true;	
		int payment = 263463201;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 255);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 27);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

}
