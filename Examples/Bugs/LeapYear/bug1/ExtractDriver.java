    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    import java.io.File;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    

		int year = 0;
		int constructor = 0;
		byte[] bytes = new byte[Integer.BYTES];
		boolean specification = true;


		if (fis.read(bytes) != -1) 
			year = (ByteBuffer.wrap(bytes).getInt());
		else
			throw new RuntimeException("too less data");

		if (year <= 0)
			specification = false;

		System.out.println("specification : " + specification + " Year is : " + year);

	
		LeapYear y = new LeapYear();
		System.out.println(" Result : " + y.isLeapYear(year));
			 
               fis.close();    
              } catch(Exception e) { System.out.println(e); }    
        } 

	
}  
