    import java.io.File;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
	 private static String address = "/Path to the jml directory that checks Perimeter preconditions/Perimeter/jml"; 
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int select = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		short shortNum = 0;
		long longNum = 0;
		byte[] bytes = new byte[Integer.BYTES];
		byte[] ShortBytes = new byte[Short.BYTES];
		byte[] LongBytes = new byte[Long.BYTES];

		if (fis.read(bytes) != -1) 
			select = ByteBuffer.wrap(bytes).getInt();

		if (fis.read(bytes) != -1) 
			num1 = ByteBuffer.wrap(bytes).getInt();

		if (fis.read(bytes) != -1) 
			num2 = ByteBuffer.wrap(bytes).getInt();
			
		if (fis.read(bytes) != -1) 
			num3 = ByteBuffer.wrap(bytes).getInt();

		if (fis.read(bytes) != -1) 
			num4 = ByteBuffer.wrap(bytes).getInt();

		if (fis.read(ShortBytes) != -1) 
			shortNum = ByteBuffer.wrap(ShortBytes).getShort();

		if (fis.read(LongBytes) != -1) 
			longNum = ByteBuffer.wrap(LongBytes).getLong();
		
		System.out.println("Select is: " + select);
		System.out.println("Selected number1 is: " + num1 + " Selected number2 is: " + num2); 
		System.out.println("Selected number3 is: " + num3 + " Selected number4 is: " + num4); 
		System.out.println("Selected shortNum is: " + shortNum + " Selected longNum is: " + longNum); 
		System.out.println("(" + select + ", " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + shortNum + ", " + longNum + ")");

		PerimeterDriver p = new PerimeterDriver();
		boolean precondition = RunRAC(select, num1, num2, num3, num4, shortNum, longNum);	
		System.out.println("precondition : " + precondition + " Result : " + p.driver(select, num1, num2, num3, num4, shortNum, longNum));
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
          }  

	  public static boolean RunRAC(int select, int num1, int num2, int num3, int num4, short shortNum, long longNum) {   
		String _select = String.valueOf(select);
		String _num1 = String.valueOf(num1);
		String _num2 = String.valueOf(num2);
		String _num3 = String.valueOf(num3);
		String _num4 = String.valueOf(num4);
		String _shortNum = String.valueOf(shortNum);
		String _longNum = String.valueOf(longNum);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";
		driverArg = "JMLDriver " + _select + " " + _num1 + " " + _num2 + " " + _num3 + " " + _num4 + " " + _shortNum + " " + _longNum;
		
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
