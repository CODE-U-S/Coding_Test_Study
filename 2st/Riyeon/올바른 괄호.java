import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(')
                st.push(ch);
            else if(ch==')'){
                if(st.empty())
                    return false;
                st.pop();
            }
        }
        return st.empty();
    }
}