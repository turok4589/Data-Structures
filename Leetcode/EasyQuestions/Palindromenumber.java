package Leetcode.EasyQuestions;

public class Palindromenumber {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        } 
        int div = 1;
        if(x >= 1000000000){  //solves overflow issue
           div = 1000000000;
        }
        else{
             while(div*10 <= x){
                div *= 10;
             }
        }
        while(x > 0){
            int right = x%10; //example 121 % 10 = 1
            int left = x/div; // 121/100 = 1.21 or 1 which gives us the left
            if(right != left)
                return false;
            x = x % div; //121 % 100 = 21 chop off the left
            x = x/10; //121/10 = 12 or 12.1 chopped off right
            div = div/100; 
        }
       return true;
    }
    public boolean isPalindrome2(int x) {
        if(x < 0){
            return false;
        } 
        long div = 1;
        long newx = x;
       // if(x >= 1000000000){
         //  div = 1000000000;
       // }
        //else{
             while(div*10 <= x){
                div *= 10;
             }
        //}
        while(newx > 0){
            long right = newx%10; //example 121 % 10 = 1
            long left = newx/div; // 121/100 = 1.21 or 1 which gives us the left
            if(right != left)
                return false;
            newx = newx % div; //121 % 100 = 21 chop off the left
            newx = newx/10; //121/10 = 12 or 12.1 chopped off right
            div = div/100; 
        }

       return true;
    }
    // could alsoo just use the long data type to avoid overflow scenarios
}
