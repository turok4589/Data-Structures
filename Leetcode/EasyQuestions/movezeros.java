package Leetcode.EasyQuestions;

public class movezeros {
    public static void move(int[] nums) {
        int unique = 0; //keep track of unique index
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[unique] = nums[i];
                unique++;
            }
        }
        //fill up the rest of the array with zeros
        for(int i = unique; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    //The shifting method caused too many issues, so this is much easier to deal with.
    public static void main(String[] args){
        int a[] = {0, 1, 0, 2, 3};
        move(a);
        for(int i  = 0; i < a.length; i++){
            System.out.println((a[i]));
        }
    }
}
