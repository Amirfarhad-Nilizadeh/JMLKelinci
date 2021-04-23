    import java.io.FileInputStream;
    import java.io.File;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver { 
	 private static String address ="/Path to the jml directory that checks Calculator preconditions/Calculator/jml"; 
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int num1 = 0;
		int num2 = 0;
		int intop = 0;
		char op = '+';
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			num1 = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			num2 = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			intop = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");
		op = (char)intop;

		boolean precondition = RunRAC(num1, num2, op);

		System.out.println("precondition : " + precondition + " num1: " + num1 + " num2: " + num2 + " Char: " + op);
		
		if (precondition) {
			Calculator cal = new Calculator();
			System.out.println("Result : " + cal.calculate(num1, num2, op));
		}			  
                fis.close();
    
              } catch(Exception e) {System.out.println(e);}    
          }    
	  public static boolean RunRAC(int num1, int num2, char op) {
		String _num1 = String.valueOf(num1);
		String _num2 = String.valueOf(num2);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + _num1 + " " + _num2 + " " + "\\"+ op;  //we add a backslash before the character. Some special characters like & and ' were making problems for running in the JMLDriver.
		
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
