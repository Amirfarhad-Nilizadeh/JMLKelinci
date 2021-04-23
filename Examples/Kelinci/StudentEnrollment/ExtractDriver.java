    import java.io.File;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver { 
         private static String address ="/Path to the jml directory that checks StudentEnrollment preconditions/StudentEnrollment/jml"; 
         public static void main(String args[]) {   
		int costPerCredit = 200;  
  		int totalCredits = 120;
 		int maxSemesterCredits = 20; 
                try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		boolean specification = true;
		int passedCredits = 0;
		int enrollmentCredits = 0;
		int payment = 0;
		int initialBalance = 0;
		boolean lateRegistration = true;
		boolean debit = true;
		boolean option = true;
		int intLateRegistration = 0;
		int intDebit = 0;
		int intOption = 0;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			passedCredits = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			enrollmentCredits = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			payment = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			initialBalance = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			intLateRegistration = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			intDebit = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			intOption = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (intLateRegistration%2 == 0)
			lateRegistration = false;

		if (intDebit%2 == 0)
			debit = false;

		if (intOption%2 == 0)
			option = false;

		boolean precondition = RunRAC(passedCredits%121, enrollmentCredits%21, payment, initialBalance/1000000, intLateRegistration, intDebit, intOption);

		System.out.println("precondition : " + precondition);
		StudentEnrollment a = new StudentEnrollment("AnyFirstName", "AnyLastName");
		a.enrollmentProcess(passedCredits%121, enrollmentCredits%21, payment, initialBalance/1000000, lateRegistration, debit, option);		 

		System.out.println("***********************************************************************");
		System.out.println(" option: " + option + " initialBalance: "  + initialBalance/1000000 + " lateRegistration: " + lateRegistration + " passedCredits: " + passedCredits%121 + " enrollmentCredits: " + enrollmentCredits%21 + " debit: " + debit + " payment: " + payment );
		System.out.println("***********************************************************************");
		System.out.println("student.getTuition() : " + a.getTuition());
		System.out.println();
		System.out.println();
		System.out.println();
                fis.close();    
              } catch(Exception e) { System.out.println(e);}    
             }  

	  public static boolean RunRAC(int passedCredits, int enrollmentCredits, int payment, int initialBalance, int intLateRegistration, int intDebit, int intOption) {
		String _passedCredits = String.valueOf(passedCredits);
		String _enrollmentCredits = String.valueOf(enrollmentCredits);
		String _payment = String.valueOf(payment);
		String _initialBalance = String.valueOf(initialBalance);
		String _intLateRegistration = String.valueOf(intLateRegistration);
		String _intDebit = String.valueOf(intDebit);
		String _intOption = String.valueOf(intOption);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + _passedCredits + " " + _enrollmentCredits + " " + _payment + " " + _initialBalance + " " + _intLateRegistration + " " + intDebit + " " + intOption;
		
		builderProg.command("sh", "-c", "runrac " + driverArg);
		
		builderProg.directory(new File(address));
		Process process = null;
		boolean result = false;
		try {
			process = builderProg.start();
			process.waitFor();
			result = process.exitValue() == 0;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		return result;
          }  
   }  
