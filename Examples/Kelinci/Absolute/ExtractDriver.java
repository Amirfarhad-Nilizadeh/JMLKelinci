    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                	FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
			boolean Specification = true;
			short shortNum = 0;
			int intNum = 0;
			long longNum = 0;
			byte[] shortBytes = new byte[Short.BYTES];
			byte[] intBytes = new byte[Integer.BYTES];
			byte[] longBytes = new byte[Long.BYTES];

			if (fis.read(shortBytes) != -1) {
				shortNum = ByteBuffer.wrap(shortBytes).getShort();
			}

			if (fis.read(intBytes) != -1) {
				intNum = ByteBuffer.wrap(intBytes).getInt();
			}

			if (fis.read(longBytes) != -1) {
				longNum = ByteBuffer.wrap(longBytes).getLong();
			}

			if(shortNum == Short.MIN_VALUE || intNum == Integer.MIN_VALUE || longNum == Long.MIN_VALUE)
					Specification = false;
			
			System.out.println("Specification " + Specification+ " shortNum: " + shortNum + " intNum: " + intNum + " longNum: " + longNum); 

			AbsoluteDriver p = new AbsoluteDriver(shortNum, intNum, longNum);
                	p.driver();
			System.out.println("sh = " + p.sh);
			System.out.println("int = " + p.i);
			System.out.println("long = " + p.l);
                	fis.close();    
              } catch(Exception e) {System.out.println(e);}    
         }    
    }  
