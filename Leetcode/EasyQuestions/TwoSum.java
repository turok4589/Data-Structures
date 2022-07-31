package Leetcode.EasyQuestions;
//This Number 1 on leetcode.
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
  private final static int sum = 8;
  private final static int[] arr =
//      {1, 2, 3, 9};
//      {1, 2, 4, 4};
      {7, 3, 2, 4, 1};

  public static void main(String[] args) {
    System.out.println(sortedHasPairWithSum(arr, sum));
    System.out.println(unSortedHasPairWithSum(arr, sum));
  }

  /**
   * O(n) solution for sorted arrays
   *
   * @param arr sorted array of integers
   * @param sum value that we want to find a pair of number to add up to
   * @return {@link Pair} (x, y) of number that add up to sum
   */
  private static Pair sortedHasPairWithSum(int[] arr, int sum) {
    int lo = 0;
    int hi = arr.length - 1;

    while (lo < hi) {
      if (arr[lo] + arr[hi] == sum)
        return new Pair(arr[lo], arr[hi]);

      if (arr[lo] + arr[hi] > sum)
        hi--;
      else
        lo++;
    }

    return null;
  }

  /**
   * O(n) solution for unsorted arrays
   *
   * @param arr un-sorted array of integers
   * @param sum value that we want to find a pair of number to add up to
   * @return {@link Pair} (x, y) of number that add up to sum
   */
  private static Pair unSortedHasPairWithSum(int[] arr, int sum) {
    HashSet<Integer> complement = new HashSet<>();

    for(int value : arr) {
      if(complement.contains(value))
        return new Pair(value, sum - value); //could just return true but he wants to also return both numbers

      complement.add(sum - value);
    }

    return null;
  }

  public static int[] indexeswithsum(int [] a, int target){
    //The idea of this is to return the indexes, so we use a map.
    HashMap<Integer, Integer> complement = new HashMap<>();
    int x = 0;
    int value = 0;
    for(int i = 0; i < a.length; i++){
       value = a[i];
       x = target - value;
       if(complement.containsKey(x)){   //so here we are doing the reverse of the above. Above we stored the complement instead of the current value in the map.
          //Now we store the value, and use the complement to check if it's in the map.
          return new int[] {complement.get(x), i}; //returns the index
       }
       //in the map we store the value and the index 
       complement.put(value, i);
    }

    throw new IllegalArgumentException("No Two Sum Solution");
  }

  /**
   * Object to allow the return of a pair.
   * There is no need to define this object in pseudo code
   */
  private static class Pair {
    private final int x;
    private final int y;

    private Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  }
}