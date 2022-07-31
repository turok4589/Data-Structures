package InterviewQuestions.Strings;
import java.io.*;
import java.util.*;

public class palindrome {

    //Stack method
    public static boolean sentencePalindrome1(String s)
    {  
       char[] str = s.toCharArray();
       Stack<Character> stack = new Stack<>();
       for (int i = 0; i < s.length(); i++){
        if (Character.isLetterOrDigit(str[i]))
            stack.push(str[i]);
        }
        String string = "";
        String reverse = "";
        for (Character character : stack) {
            reverse += Character.toLowerCase(character);
        }
        System.out.println(reverse);
        while (!stack.isEmpty()){
             string += Character.toLowerCase(stack.pop());
         }
        System.out.println(string);
      return string.equals(reverse); 
    }

    //Reverse string method
    //(2N)
    public static boolean sentencePalindrome2(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";
        String newstring = "";
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
        //This reverses the string
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = Character.toLowerCase(str.charAt(i));
            if(c >= 'a' && c <= 'z'){
                rev = rev + c;
            }
        }
        System.out.println(rev);
        //We need to get rid of extra characters
        for (int i = 0; i <= str.length() - 1; i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if(c >= 'a' && c <= 'z'){
                newstring = newstring + c;
            }
        }
        System.out.println(newstring);
 
        // Checking if both the strings are equal
        if (newstring.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    //Pointer method(Best Method)
    //O(n) Time
    public static boolean sentencePalindrome3(String str)
    {   
        int l = 0;
        int h = str.length()-1;
         
        // Lowercase string
        str = str.toLowerCase();
         
        // Compares character until they are equal
        while(l <= h)
        {
             
            char getAtl = str.charAt(l);
            char getAth = str.charAt(h);
             
            // If there is another symbol in left
            // of sentence
            if (!(getAtl >= 'a' && getAtl <= 'z'))
                l++;
             
            // If there is another symbol in right
            // of sentence
            else if(!(getAth >= 'a' && getAth <= 'z'))
                h--;
             
            // If characters are equal
            else if( getAtl == getAth)
            {
                l++;
                h--;
            }
             
            // If characters are not equal then
            // sentence is not palindrome
            else
                return false;
        }
         
        // Returns true if sentence is palindrome
        return true;   
    }
     
    public static void main(String[] args)
    {
        String str = "Too hot to hoot.";
        String str2 = "Hi Bob";
        String str3 = "0P";
        if(sentencePalindrome3(str3))
          System.out.println("Sentence is palindrome");
        else
          System.out.println("Sentence is not" + " " +
                                         "palindrome");
    }
}
