import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i=numbers.length-1; i>=0; i--){
            answer[i] = -1;
            while(!st.isEmpty()){
                if(st.peek() > numbers[i]){
                    answer[i] = st.peek();
                    break;
                }else
                    st.pop();
            } 
            st.push(numbers[i]);
        }
        return answer;
    }
}