    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]){    
              try {    
                FileInputStream fis = new FileInputStream("id:000000,orig:example.txt");    
		int num1 = 0;
		int num2 = 0;
		boolean Specification = true;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			num1 = ByteBuffer.wrap(bytes).getInt();

		if (fis.read(bytes) != -1) 
			num2 = ByteBuffer.wrap(bytes).getInt();

		if (num1 == Integer.MAX_VALUE || num2 == Integer.MAX_VALUE || num1 <= Integer.MIN_VALUE + 1 || num2 <= Integer.MIN_VALUE + 1)
			Specification = false;

		System.out.println("Specification: " + Specification + " Number 1 is: " + num1 + " Number 2 is: " + num2); 
		GCD g = new GCD();
		System.out.println("Result = " + g.gcd(num1, num2));	  
      
                fis.close();    
              } catch(Exception e) {System.out.println(e);}    
           }    
      }  
