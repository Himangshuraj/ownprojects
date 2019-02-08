
public class Palindrome {
 
 /*
  * Implement this method and return true if the word is the same 
  * forward and backwards
  * Do not use automatic methods for reversing the string
  */
 private boolean isPalindrome(String word) {
  String reverse = "";//identification
  //https://stackoverflow.com/questions/4138827/check-string-for-palindrome
 //looked at respotories in git hub, had confusion with line 14.
 int length = word.length();
     for (int i = 0; i < length; i++){
       reverse = reverse+word.charAt(i);
      
     }
    return word.equals(reverse);
   }
 private void findAllPalindromes(String fileName) {
  
 }
 public Palindrome() {
  //run some tests

  if (isPalindrome("racecar")) {
      System.out.println("pass");
  }
  else {
    System.out.println("Fail");
  }
  if (isPalindrome("mom")) {
     System.out.println("pass");
     }
  else {
    System.out.println("Fail");
  }
  if (isPalindrome("noon")) {
     System.out.println("pass");
     }
  else {
    System.out.println("Fail");
  }
    
   }

 public static void main(String[] args) {
  new Palindrome();

 }

}














