    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    import java.io.File;
    public class DataStreamExample {  
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000004,src:000000,op:havoc,rep:8,+cov");    

		int year = 0;
		int constructor = 0;
		byte[] bytes = new byte[Integer.BYTES];


		if (fis.read(bytes) != -1) 
			year = (ByteBuffer.wrap(bytes).getInt());
		else
			throw new RuntimeException("too less data");

		

		System.out.println("Year is : " + year);

	
		LeapYear y = new LeapYear();
		System.out.println(" Result : " + y.isLeapYear(year));
			 
               fis.close();    
              } catch(Exception e) { System.out.println(e); }    
        } 

	
}  
