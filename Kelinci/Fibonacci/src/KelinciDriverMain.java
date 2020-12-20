     import java.io.FileInputStream;
     import java.io.File;
     import java.io.IOException;
     import java.nio.ByteBuffer;
     public class KelinciDriverMain {	 
    	 public static void main(String args[]) {

	 	if (args.length != 1) {
           		System.out.println("Expects file name as parameter");
           		return;
		}

		int size = 0;
		int constructor = 0;
		
		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				size = (ByteBuffer.wrap(bytes).getInt());
			else
				throw new RuntimeException("too less data");

			if (fis.read(bytes) != -1) 
				constructor = (ByteBuffer.wrap(bytes).getInt());
			else
				throw new RuntimeException("too less data");
		} catch (IOException e) {
           		System.err.println("Error reading input");
            		e.printStackTrace();
            		return;
		}

		int select = constructor%5;
		if (select == 0) {
			Fibonacci f = new Fibonacci();
			f.fibCompute();
                	f.getFib(1);	
		} else {
  			Fibonacci f = new Fibonacci(size);
			f.fibCompute();
			f.getFib(size-1);
	 	}
         }
     }
