public class StudentEnrollment {
    public static final int costPerCredit = 200;  
    public static final int totalCredits = 120;
    public static final int maxSemesterCredits = 20;

    /*@ spec_public @*/ private String firstName;
    /*@ spec_public @*/ private String lastName;
    StudentEnrollment(/*@ non_null @*/ String firstName,
              /*@ non_null @*/ String lastName) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*@   public normal_behavior
      @   	requires 0 < payment;
      @         requires passedCredits + semesterCredits <= totalCredits;
      @   	requires initialBalance <= maxSemesterCredits * costPerCredit + maxSemesterCredits * ((costPerCredit/100)*6);
      @   	requires 0 <= semesterCredits && semesterCredits <= maxSemesterCredits;
      @  	requires 0 <= passedCredits && passedCredits <= totalCredits;
     @*/
    public void enrollmentProcess(int passedCredits, int semesterCredits, int payment, int initialBalance, boolean lateRegistration, boolean debit, boolean option) 
     {   }
}
