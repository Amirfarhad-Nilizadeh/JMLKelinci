public class PerimeterDriver {
	 /*@ requires 0 <= select && select < 6;
	  @ {|
	     @    requires select == 0;
	     @    requires 0 < shortNum && shortNum <= Short.MAX_VALUE;
	     @ also 
	     @    requires select == 1;
	     @    requires 0 < w && w <= Integer.MAX_VALUE;
	     @ also 
	     @    requires select == 2;
	     @    requires 0 < longNum && 6*longNum <= Long.MAX_VALUE;
	     @ also 
	     @    requires select == 3;
	     @    requires 0 < w && 0 < x && 2*w + 2*x <= Integer.MAX_VALUE;
	     @ also 
	     @    requires select == 4;
	     @    requires 0 < w && 0 < x && 0 < y && w + x + y <= Integer.MAX_VALUE;
	     @ also 
	     @    requires select == 5;
	     @    requires 0 < w && 0 < x && 0 < y && 0 < z && w + x + y + z <= Integer.MAX_VALUE;
	  @ |} @*/
	 public long driver(int select, int w, int x, int y, int z, short shortNum, long longNum) { return 0;}
}
