import java.util.*;
class Solution{
    public int solution(String s){
        Stack<String> st = new Stack<>();
        for(String str : s.split("")){
            if(!st.isEmpty()){
                if(st.peek().equals(str))
                    st.pop();
                else st.push(str);
            }else st.push(str);
        }
        return st.isEmpty()? 1 : 0;
    }
}