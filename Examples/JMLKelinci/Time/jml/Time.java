public class Time {
    private /*@ spec_public @*/ int second;
    private /*@ spec_public @*/ int minute;
    private /*@ spec_public @*/ int hour;

    /*@ public invariant 0 <= second && second < 60;
      public invariant 0 <= minute && minute < 60;
      public invariant 0 <= hour && hour < 24; @*/

    public /*@ pure @*/ Time() 
    {
        hour = 23;
        minute = 59;
        second = 59;
    }

    //@ requires 0 <= h && h < 24;
    //@ requires 0 <= m && m < 60;
    //@ requires 0 <= s && s < 60;
    public /*@ pure @*/ Time(int h, int m, int s) 
    {
        hour = h;
        minute = m;
        second = s;
    }
 
    //@ requires 0 <= sel && sel < 5;    
    public Time timeOptions(Time start, Time stop, int sel) { return null; }
	
}	
