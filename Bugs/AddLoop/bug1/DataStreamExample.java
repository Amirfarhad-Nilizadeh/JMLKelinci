    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class DataStreamExample {  
	 private static String address ="/home/amirfarhad/Desktop/ProgramAnalysis/codes/Kelinci/JMLKelinci/JMLKelinci/AddLoop/jml";
         public static void main(String args[]){    
              try {    
                	FileInputStream fis=new FileInputStream("id:000004,src:000000,op:havoc,rep:32,+cov");    

			int num1 = 0;
			int num2 = 0;

			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				num1 = ByteBuffer.wrap(bytes).getInt();

			if (fis.read(bytes) != -1) 
				num2 = ByteBuffer.wrap(bytes).getInt();

				boolean precondition = RunRAC(num1, num2);

			System.out.println("precondition " + precondition + " num1: " + num1 + " num2: " + num2); 
	
			if (precondition) {
				AddLoop add = new AddLoop();
				System.out.println(" Result : " + add.AddLoop(num1, num2));	
			}	 
  
      
                	fis.close();    
              } catch(Exception e){System.out.println(e);}    
        } 

	public static boolean RunRAC(int num1, int num2) {
	     
		String _num1 = String.valueOf(num1);
		String _num2 = String.valueOf(num2);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		//driverArg = "JMLDriver " + _size + " >log.txt 2>&1";
		driverArg = "JMLDriver " + _num1 + " " + _num2;
		
		builderProg.command("sh", "-c", "runrac " + driverArg);
		
		builderProg.directory(new File(address));
		Process process = null;
		boolean result = false;
		try {
			process = builderProg.start();
			process.waitFor();
			result = process.exitValue() == 0 ? true : false;
		} catch (Exception e) {	
			e.printStackTrace();	
			System.err.println("Error in the RunRac method!");
		}
		return result;
         }   
 }  
