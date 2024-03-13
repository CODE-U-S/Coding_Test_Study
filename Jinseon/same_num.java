import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack st = new Stack();
        
        for(int i = 0; i < arr.length; i++){
            if(!st.empty()){
                if((int)st.peek() != arr[i]){
                    st.push(arr[i]);
                }
            } else {
                st.push(arr[i]);
            }
        }
        int[] answer = new int[st.size()];
        for(int i = answer.length - 1; i >= 0; i--){
            if(!st.empty()){
                answer[i] = (int)st.pop();                
            }
        }
        return answer;
    }
}