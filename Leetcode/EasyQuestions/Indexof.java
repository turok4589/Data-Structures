package Leetcode.EasyQuestions;
//This leetcode strstr, leetcode 28
public class Indexof {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return -1;
        }
        if(haystack.equals(needle))
            return 0;
        int i = 0;
        int sp = 0;
        int fp = needle.length();
        while(sp != fp && fp <= haystack.length()){
            if(haystack.substring(sp, fp).equals(needle)){
               return i;
            }
            else{
                sp++;
                fp++;
                i = sp;
            }
        }
       return -1;
    }
    //basically we're trying to mimic the indexof method in java 
    //where it would return the first index of the needle string, inside another string.
    //so flower - flow would return 0.
    //hello, and needle is ll so index of should be 2
    //the idea is that we use the substring method, and have two pointers at the start, and at the end.
    //sp = 0; and fp will be set to the size of the needle string.
    //we then use that to get the appropriate substring.
    //so hello and ll
    //substring[0, 2] is he
    //substring[1,3] is el
    //substring[2,4] is ll
    //this means that we have a valid substring and now we return the the sp or i.
}
