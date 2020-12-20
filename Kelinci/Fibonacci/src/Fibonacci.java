public class Fibonacci {
   	private /*@ spec_public @*/ long fib[];
	//@ public invariant 2 <= fib.length && fib.length <= 93; // 93 < size ==> Long Overflow 

	//@ ensures fib[0] == 0 && fib[1] == 1;
	Fibonacci()
	{
		fib = new long[2];
		fib[0] = 0;
		fib[1] = 1;
	}
	/*@ 	public normal_behavior
	  @ 		requires 2 <= size && size <= 93;
	  @ 		ensures fib[0] == 0 && fib[1] == 1;
	  @ 		ensures (\forall int i; 2 <= i && i < fib.length; fib[i] == 0);
	  @ also
	  @ 	public exceptional_behavior
   	  @ 		requires size < 2 || 93 < size;
	  @ 		signals_only IllegalArgumentException; @*/ 	
	/*@ spec_public @*/ Fibonacci(int size)
	{
		if (2 <= size && size <= 93) {
			fib = new long[size];	
			fib[0] = 0;
			fib[1] = 1;
		} else {
			throw new IllegalArgumentException();
		}
	}


	public /*@ pure @*/ long getFib(int index) 
	{
		return fib[index];
	}
	
	public void fibCompute() 
	{
		int index = 2;
		
		while (index < fib.length) {
			//@ assume fib[index - 2] + fib[index - 1] <= Long.MAX_VALUE;
			//@ assume 0 < fib[index - 2] + fib[index - 1];
			fib[index] = fib[index - 2] + fib[index - 1];
			index++;
                        //@ assume fib[index-2] <  fib[index-1];
		}
	}
}
