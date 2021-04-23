    import java.io.FileInputStream;
    import java.io.File;
    import java.io.IOException; 
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
	 private static String address ="/Path to the jml directory that checks CombinationPermutation preconditions/CombinationPermutation/jml";
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    

		int n = 0;
		int r = 0;
		int changeToBoolean = 0;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			n = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			r = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		if (fis.read(bytes) != -1) 
			changeToBoolean = ByteBuffer.wrap(bytes).getInt();
		else
			throw new RuntimeException("too less data");

		boolean flag = (changeToBoolean%2 == 0); 

		boolean precondition = RunRAC(n, r, flag);

		System.out.println("***********************************************************************");
		System.out.println("precondition: " + precondition +  " num1: " + n + " num2: " + r + " flag: " + flag);
		System.out.println("***********************************************************************");

		if (precondition) {
			CombinationPermutation p = new CombinationPermutation();
			System.out.println( "Result : " + p.select(n, r, flag));	
		} 
      
                fis.close();    
              } catch(Exception e) { System.out.println(e); }    
         }    

	 public static boolean RunRAC(int n, int r, boolean flag) {
	     
		String _n = String.valueOf(n);
		String _r = String.valueOf(r);
		String _flag = String.valueOf(flag);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + _n + " " + _r + " " + _flag;
		
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
