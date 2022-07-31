package Leetcode.EasyQuestions;

import java.util.HashMap;
import java.util.Stack;

//Pretty good but could be slightly better
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> hole = new Stack<>();
        for(int i = 0; i < s.length(); i++){
             if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
               hole.push(s.charAt(i));
              }
             else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
             //closing brackets
                    if(hole.size() > 0){
                            if(hole.peek() == '(' && s.charAt(i) == ')'){
                                hole.pop();
                                //keep going
                            }
                            else if(hole.peek() == '{' && s.charAt(i) == '}'){
                                hole.pop();
                                //keep going
                            }
                            else if(hole.peek() == '[' && s.charAt(i) == ']'){
                                hole.pop();
                                //keep going
                            }
                            else{
                                return false;
                            }
                    }
                    else
                        return false;
                }
       }
       return hole.isEmpty();
    }

    public static void main(String[] args){

    }
}