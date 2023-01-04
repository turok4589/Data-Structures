package Leetcode.EasyQuestions;

public class Plusone {
    public int[] plusOne(int[] digits) {
        //biggest numbers you'll is 9
        //99
        //999
        //So whenever you see a 9 you'll see those indexes to 0
        //otherwise just increment 1
       for(int i = digits.length - 1; i >= 0; i--){ //starting from the back of the array
           if(digits[i] < 9){
               digits[i] = digits[i] + 1;
               return digits;
           }
           else if(digits[i] == 9){ //don't need this if statement but makes me feel better
               digits[i] = 0; //set to 0 when 9
           }
       }
       int[] result = new int[digits.length + 1];
       result[0] = 1; ///999 becomes 1000, java initialzes arrays with 0's
       return result;
   }
}
