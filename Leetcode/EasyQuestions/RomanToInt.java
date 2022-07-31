package Leetcode.EasyQuestions;

import java.util.HashMap;

import javax.lang.model.util.ElementScanner14;

//this is number 2 in leetcode
//This is the example that came to mind and I thought it was okay because it was still Linear time.
//It's only slightly slower than the hashmap example.
public class RomanToInt {
    public static int romanToInt1(String s) {
        int next = 0;
        int total = 0;
        s = s.toUpperCase();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                next = i+1;
                if(next < s.length() && s.charAt(next) == 'V')
                  {
                      total = total +4;
                      i = next;
                  }
                else if(next < s.length() && s.charAt(next) == 'X')
                {
                   total = total + 9;
                   i = next;
                }
                else
                    total = total + 1;
            }
            else if(s.charAt(i) == 'V'){
                total = total + 5;
            }
            else if(s.charAt(i) == 'X'){
                next = i+1;
                if(next < s.length() && s.charAt(next) == 'L')
                {
                   total = total + 40;
                   i = next;
                }
                else if(next < s.length() && s.charAt(next) == 'C')
                {
                   total = total + 90;
                   i = next;
                }
                else
                   total = total + 10;
            }
            else if(s.charAt(i) == 'L'){
                total = total + 50;
            }
            else if(s.charAt(i) == 'C'){
                next = i + 1;
                if(next < s.length() && s.charAt(next) == 'D')
                {
                   total = total + 400;
                   i = next;
                }
                else if(next < s.length() && s.charAt(next) == 'M')
                {
                   total = total + 900;
                   i = next;
                }
                else
                   total = total + 100;
            }
            else if(s.charAt(i) == 'D'){
                total = total + 500;
            }
            else if(s.charAt(i) == 'M'){
                total = total + 1000;
            }
            else
                throw new IllegalArgumentException("Invalid Character in String");
        }
       return total;
    }
    //This is still O(n), but it is slightly faster than the above example. The if statements slow down our code but not by much.
    public static int romanToInt2(String s){
        //This is going to use a hashmap instead of a bunch of if statements.
        //This is slightly faster as both are O(n)
        //In this case we are going to traverse the array in reverse.
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = map.get(s.charAt(s.length()-1)); //This will enter the the amount at the end of the string. 
        //now we need to create a for loop that starts from the second to last character.
        for(int i = s.length() - 2; i >= 0; i--){
            //we need to compare characters at the i and i+1 position
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){ //Checking if i < i+1 in the character so think IV   I < V so we know to subtract 5 -1 = 4 
               total -= map.get(s.charAt(i)); //so say we had IV. We would have 5 already in the result and then we would need subtract by i which would be 1.
            }
            else{
                total += map.get(s.charAt(i));
            }
        }
       return total;
    }
    public static void main(String [] args){
        String s = "IX";
        System.out.println(romanToInt2(s));
    }
}
