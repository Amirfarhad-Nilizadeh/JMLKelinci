    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                	FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
			int num1 = 0;
			int num2 = 0;
			boolean Specification = true;
			byte[] bytes = new byte[Integer.BYTES];

			if (fis.read(bytes) != -1) 
				num1 = ByteBuffer.wrap(bytes).getInt();

			if (fis.read(bytes) != -1) 
				num2 = ByteBuffer.wrap(bytes).getInt();

			if(num2 == Integer.MIN_VALUE) 
				Specification = false;

			if(0 < num1 && 0 < num2)
				if((Integer.MAX_VALUE - num2) < num1)
					Specification = false;		

			if(num1 < 0 && num2 < 0)
				if(num1 < (Integer.MIN_VALUE - num2))
					Specification = false;

			System.out.println("Specification " + Specification + " num1: " + num1 + " num2: " + num2); 
			  
                	fis.close();    
              } catch(Exception e) { System.out.println(e); }    
         }    
    }  
