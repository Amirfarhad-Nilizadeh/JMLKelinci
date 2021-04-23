    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    import java.io.File;
    public class ExtractDriver {  
	private static String address ="/Path to the jml directory that checks Fibonacci preconditions/Fibonacci/jml";
        public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int size = 0;
		int constructor = 0;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			size = (ByteBuffer.wrap(bytes).getInt());
		else
			throw new RuntimeException("too less data");


		if (fis.read(bytes) != -1) 
			constructor = (ByteBuffer.wrap(bytes).getInt());
		else
			throw new RuntimeException("too less data");

		int select = constructor%5;
		boolean precondition = RunRAC(select, size);

		System.out.println("Select is : " + select + " Size is : " + size + " precondition is : " + precondition);

		if (precondition) { 
			if (select == 0) {
				Fibonacci f = new Fibonacci();
				f.fibCompute();
	                	f.getFib(1);
				System.out.println(" f.getFib(1) is: " +  f.getFib(1));	
			} else {
	  			Fibonacci f = new Fibonacci(size);
				f.fibCompute();
				f.getFib(size-1);
				System.out.println(" f.getFib("+ size + ") is: " +  f.getFib(size-1) + " size " + size);	
		 	}
		} else { System.out.println("It was not a path in the under test program.");}
		
			 
               fis.close();    
              } catch(Exception e) { System.out.println(e); }    
        } 

	public static boolean RunRAC(int select, int size) {
	     
		String _select = String.valueOf(select);
		String _size = String.valueOf(size);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + _select + " " + _size;
		
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
