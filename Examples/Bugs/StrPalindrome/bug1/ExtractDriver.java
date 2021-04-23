    import java.io.FileInputStream;  
    import java.nio.ByteBuffer;
    import java.util.ArrayList;
    import java.util.List;
    public class ExtractDriver {  
         public static void main(String args[]) {    
              try {    
                FileInputStream fis=new FileInputStream("id:000000,orig:example.txt");    
		int range = 100;
		int StringSize = 0;
		char[] Array_inputString;
		String inputString;
		List<Character> values = new ArrayList<>();
		byte[] bytes = new byte[Integer.BYTES];
		int i = 0;
		int j = 0;
            	int value;
		if (fis.read(bytes) != -1) 
			StringSize = ByteBuffer.wrap(bytes).getInt(); 
		else
			throw new RuntimeException("too less data");

		StringSize %= range;  // This is not for Specification. "StringSize %= range;" is for memory limitation of System.
		System.out.println("StringSize: " + StringSize);

		System.out.println("***********************************************************************");
            	while (((value = fis.read(bytes)) != -1) && (i < StringSize)) {
			value = ByteBuffer.wrap(bytes).getInt();  
			value = value % 94; // Not for Specification. ASCII codes are visible for testing
			if (value < 0) 
				value = -value;
			value += 33;  //visible characters are between 33 to 126
               		char charValue = (char)value;
			System.out.print(charValue);
			values.add(charValue);
                    	i++;
		}

		if (i != StringSize){
			System.out.println("***************too less data***************");
			throw new RuntimeException("too less data");
		}

		Array_inputString = new char[values.size()];

            	for (i = 0; i < values.size(); i++) {
               		Array_inputString[i] = values.get(i);
			System.out.print(Array_inputString[i]);
            	}
			System.out.println();			

		inputString = new String(Array_inputString);

		Palindrome p = new Palindrome();
                System.out.println("Result : " + p.isPalindrome(inputString));

                fis.close();    
              } catch (Exception e){System.out.println(e); }    
          }    
      }  
