public class Calculator {
    /*@    requires (37 <= (int)operator && (int)operator <= 47) && operator != '+' && operator != '*' &&
           operator != '-' && operator != '/' && operator != '%';
      @ also
      @    requires operator == '+';
      @    requires num1 + num2 <= Integer.MAX_VALUE;
      @    requires Integer.MIN_VALUE <= num1 + num2;
      @ also
      @    requires operator == '*'; 
      @    requires num1 * num2 <= Integer.MAX_VALUE;
      @    requires Integer.MIN_VALUE <= num1 * num2;
      @ also
      @    requires operator == '-'; 
      @    requires num1 - num2 <= Integer.MAX_VALUE;
      @    requires Integer.MIN_VALUE <= num1 - num2;
      @ also
      @    requires operator == '/'; 
      @    requires num2 != 0;
      @    requires num1 / num2 <= Integer.MAX_VALUE;
      @    requires num1 / num2 != Integer.MIN_VALUE;
      @ also
      @    requires operator == '%'; 
      @    requires num2 != 0;
      @    requires num1 % num2 != Integer.MIN_VALUE;
      @    ensures \result == (num1 % num2); @*/
    public int calculate(int num1, int num2, char operator) { return 0;}
}
