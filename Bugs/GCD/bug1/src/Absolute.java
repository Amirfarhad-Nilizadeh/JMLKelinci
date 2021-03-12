public class Absolute {
	/*@    requires 0 <= num && num <= Integer.MAX_VALUE;
	  @    ensures \result == num;
	  @    ensures 0 <= \result && \result <= Integer.MAX_VALUE;
	  @ also
	  @    requires Integer.MIN_VALUE < num && num < 0;
	  @    ensures \result == -num; 
	  @    ensures 0 <= \result && \result <= Integer.MAX_VALUE; @*/
	public /*@ pure @*/ int Absolute(int num) {
		if (0 <= num)
			return num;
		else
			return -num;
	}
}
