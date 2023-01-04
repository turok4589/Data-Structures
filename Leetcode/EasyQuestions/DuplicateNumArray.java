package Leetcode.EasyQuestions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

public class DuplicateNumArray {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        map.add(nums[0]);
        for(int i = 1; i < nums.length; i++){//add to map if not equal
            if(map.contains(nums[i]))
                return true;
            map.add(nums[i]);
        }
      return false;
    }
    //first method is two for loops
    //next method is to sort the array, and then check the array.
    //nLogn time complexity for that method
}
