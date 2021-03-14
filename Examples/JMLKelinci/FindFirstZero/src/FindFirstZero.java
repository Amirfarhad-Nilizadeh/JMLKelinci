public class FindFirstZero {
	 //@    requires x.length == 0;
   	 //@    ensures \result == -1; 			
	 //@ also
	 //@    requires 0 < x.length && x.length <= Integer.MAX_VALUE; 
   	 //@    ensures \result < x.length;
   	 //@    ensures 0 <= \result && \result < x.length ==> x[\result] == 0 && (\forall int i; 0 <= i && i < \result; x[i] != 0);
	 //@    ensures \result == -1 ==> (\forall int i; 0 <= i && i < x.length; x[i] != 0);
    	 public static int FindFirstZero(int[] x) {
         	if (x.length == 0) {
            		return -1;
        	} else {
            		int index = 0;
            		//@ maintaining (\forall int i; 0 <= i && i < index; x[i] != 0);
            		//@ maintaining (0 <= index && index <= x.length);
            		//@ decreases x.length - index;
            		while (x.length - index > 0 && x[index] != 0) {
                		index = index + 1;
            		}
            		if (x.length - index == 0) {
               			index = -1;
            		}
            	return index;
        	}
    	}
}

