public class StrPalindrome {
   private /*@ spec_public @*/ String reverse = "";
   /*@ public normal_behavior
     @    requires (\forall int i; 0 <= i && i < str.length(); (int)Character.MIN_VALUE <= (int)str.charAt(i) && (int)str.charAt(i) <= (int)Character.MAX_VALUE);
 @*/
   public boolean isPalindrome(String str) {   
      return true;
   }
} 