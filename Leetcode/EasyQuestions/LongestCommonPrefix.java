package Leetcode.EasyQuestions;

public class LongestCommonPrefix {
    //Quadratic Time Example
    public static String LongCommon1(String [] a){
       if(a.length == 0){
         return "";
       }
       String firstString  = a[0];
       for(int i = 1; i < a.length; i++){ //Start from the first string and chop off a character each time.
             //start from the second string
             while(a[i].indexOf(firstString) != 0){ //basically index off returns the first occurence so. If you're saying flower into flow then it'll chop off until you reach 0.
                //if there is no substring then it'll equal -1 and firstString will be chopped off completely.
                firstString = firstString.substring(0, firstString.length() - 1);
             }
       }
       return firstString;
    }
    //Time Complexity is (A*B), because different terms for inputs.
    //Loop through array, then loop through string.
    //Not sure about the space complexity.
    //My initial guess is constant space because we create a variable, but technically we are constantly creating new strings.
    //So it could also be O(n)
    //He says that its N^2 because we're not looping through the strs array in the inner loop. We're popping characters off one string
    //So he argues a time complexity of 0(n)

    public static void main(String[] args){
        String [] strs = {"flower","flow","flight"};
        System.out.println(strs[0].indexOf("hello")); //-1 is returned because there is no substring present.
        System.out.println(strs[0].indexOf("")); //0 is returned
        System.out.println("The longest common prefix is: " + LongCommon1(strs));
    }
}

//Doing this in python: https://bobbyhadz.com/blog/python-valueerror-substring-not-found#:~:text=The%20Python%20%22ValueError%3A%20substring%20not,using%20a%20try%2Fexcept%20block.