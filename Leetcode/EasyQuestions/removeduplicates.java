package Leetcode.EasyQuestions;

public class removeduplicates {
    public int removeDuplicates(int[] nums) {
        //Sorted Array remove duplicates
        //Signals Using Pointers
        int high = 1;;
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] != nums[i+1]){
                //now we need to swap some values
                nums[high] = nums[i + 1];
                //Need to swap the next index with the our current high index
                //if they are the same.
                high++; //keep track of current index to enter
            }
        }
       return high;
    }
     //Tricky question as I didn't realize what the high pointer really did
     //High keeps track of the current index we are placing the next unique number.
    //Once we find something unique, we swap the two values.

}

