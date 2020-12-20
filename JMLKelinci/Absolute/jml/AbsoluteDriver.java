public class AbsoluteDriver {

	//@ requires Short.MIN_VALUE < sh && sh <= Short.MAX_VALUE;
	//@ requires Integer.MIN_VALUE < i && i <= Integer.MAX_VALUE;
	//@ requires Long.MIN_VALUE < l && l <= Long.MAX_VALUE;
	public AbsoluteDriver(short sh, int i, long l) { }
}
