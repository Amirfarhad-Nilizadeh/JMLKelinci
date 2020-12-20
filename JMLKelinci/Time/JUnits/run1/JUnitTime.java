
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitTime {

	@Test
	public void test() {
		int constructor = 0;
		int select = 0;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test1() {
		int constructor = 1;
		int select = 0;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test2() {
		int constructor = 0;
		int select = 1;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test3() {
		int constructor = 0;
		int select = 1;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 16;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test4() {
		int constructor = 0;
		int select = 2;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 27;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test5() {
		int constructor = 0;
		int select = 4;
		int hour = 0;
		int minute = 16777216;
		int second = 5632;
		int start_h = 0;
		int start_m = 21;
		int start_s = 0;
		int stop_h = 21;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(20, 39, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test6() {
		int constructor = 0;
		int select = 4;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 48;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 48);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test7() {
		int constructor = 0;
		int select = 3;
		int hour = 0;
		int minute = 0;
		int second = 196608;
		int start_h = 17;
		int start_m = 48;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 48;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test8() {
		int constructor = 0;
		int select = 3;
		int hour = 100663296;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 48;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 48;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test9() {
		int constructor = 0;
		int select = 4;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 48;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 4;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 44, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test10() {
		int constructor = 0;
		int select = 4;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 2;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 2);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test11() {
		int constructor = 0;
		int select = 3;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 2;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test12() {
		int constructor = 0;
		int select = 4;
		int hour = 16;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 2;
		int stop_h = 21;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(20, 59, 58);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test13() {
		int constructor = 0;
		int select = 4;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 4;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 4, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test14() {
		int constructor = 0;
		int select = 4;
		int hour = 10289152;
		int minute = 6144;
		int second = 0;
		int start_h = 2;
		int start_m = 27;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(2, 27, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test15() {
		int constructor = 0;
		int select = 3;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 0;
		int start_m = 0;
		int start_s = 0;
		int stop_h = 0;
		int stop_m = 0;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}
}
