package Leetcode.EasyQuestions;

//In this example they wanted to include numbers
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int fp = 0;
        int lp = s.length() - 1;
        s = s.toLowerCase();
        while(fp < lp){
           if(s.charAt(fp) == s.charAt(lp))
           {
               fp++;
               lp--;
           }
           //check if left is a space or a dot etc.
           else if(!(Character.isLetterOrDigit(s.charAt(fp)))){
              fp++;
           }
           else if(!(Character.isLetterOrDigit(s.charAt(lp)))){
               lp--;
           }
           else{
               return false;
           }
        }
       return true;
    }
}
