package Leetcode.EasyQuestions;

public class squarex {
    public int mySqrt(int x) {
        //use long data type to avoid overflow
        long left = 0;
        long right = x;
        long mid = 0;
        if(x < 2){
            return x;
        }
        //we are implementing a binary search
        while(left < right){
            mid = (left + right)/2;
            if(mid * mid == x){
                return (int)mid;
            }
            else if(mid * mid > x){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
       return (int)left - 1;
    }
}
