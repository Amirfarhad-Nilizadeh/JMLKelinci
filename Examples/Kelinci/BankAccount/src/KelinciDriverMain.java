     import java.io.FileInputStream;
     import java.io.IOException;
     import java.nio.ByteBuffer;

     public class KelinciDriverMain {	 
         public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}
	
		int balance = 0;
		int option = 0;
		int amount = 0;
		int previousTransaction = 0;
		int choosingConstructor = 0;
	
		try (FileInputStream fis = new FileInputStream(args[0])) {
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
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		int flag = choosingConstructor%3; 

		if (flag < 0)
			flag = -flag;

		if (flag == 0) {
			BankAccount a = new BankAccount();
			a.menu(option, amount);	
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			b.menu(option, amount);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			c.menu(option, amount);	
	    	}	 
         }
     }
