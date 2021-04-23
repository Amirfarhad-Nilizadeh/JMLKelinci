    import java.io.File;
    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver { 
	 private static String address ="/Path to the jml directory that checks BankAccount preconditions/BankAccount/jml"; 
         public static void main(String args[]){    
              try {    
                	FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
			int balance = 0;
			int option = 0;
			int amount = 0;
			int previousTransaction = 0;
			int choosingConstructor = 0;
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				balance = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				option = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				amount = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				previousTransaction = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				choosingConstructor = ByteBuffer.wrap(bytes).getInt();
			else
				throw new RuntimeException("too less data");

			int flag = choosingConstructor%3;

			if (flag < 0)
				flag = -flag; 

			boolean precondition = RunRAC(balance, option, amount, previousTransaction, flag);

			if (flag == 0) {
				BankAccount a = new BankAccount();
				System.out.println(" Result : " + a.menu(option, amount));	
			} else if (flag == 1) {	
				BankAccount b = new BankAccount(balance);
				System.out.println(" Result : " + b.menu(option, amount));	
			} else {
				BankAccount c = new BankAccount(balance, previousTransaction);
				System.out.println(" Result : " +c.menu(option, amount));	
	    		}

			/***********************************************************************/
			System.out.println("***********************************************************************");
			System.out.println("precondition: " + precondition + " flag: " + flag + " option: " + option  + " amount: " + amount + " balance: " + balance +   " previousTransaction : " + previousTransaction);
			System.out.println("***********************************************************************");
                	fis.close();    
              } catch(Exception e) { System.out.println(e); }    
         }  
	 public static boolean RunRAC(int balance, int option, int amount, int previousTransaction, int flag) {
		String _balance = String.valueOf(balance);
		String _option = String.valueOf(option);
		String _amount = String.valueOf(amount);
		String _previousTransaction = String.valueOf(previousTransaction);
		String _flag = String.valueOf(flag);

		ProcessBuilder builderProg = new ProcessBuilder();
		String driverArg = "";

		driverArg = "JMLDriver " + _balance + " " + _option + " " + _amount + " " + _previousTransaction + " " + _flag;
		
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
