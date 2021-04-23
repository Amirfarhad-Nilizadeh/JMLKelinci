    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]){    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int num = 0;
		boolean Specification = true;
		byte[] bytes = new byte[Integer.BYTES];

		if (fis.read(bytes) != -1) 
			num = ByteBuffer.wrap(bytes).getInt();
		if (num < 2) 
			Specification = false;

		System.out.println("Specification " + Specification + " Selected num is: " + num); 
		PrimeCheck p = new PrimeCheck();
		System.out.println("Result : " + p.isPrime(num));	  
                fis.close();    
              } catch (Exception e) { System.out.println(e); }    
          }    
    }  
