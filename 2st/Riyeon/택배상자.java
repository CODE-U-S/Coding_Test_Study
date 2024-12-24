import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0, orderIdx = 0, i = 1;
        Stack<Integer> st = new Stack<>();
        while(true){
            if(order[orderIdx] == i){
                answer++;
                orderIdx++;
            }else if(!st.isEmpty() && order[orderIdx] == st.peek()){
                st.pop();
                answer++;
                orderIdx++;
                i--;
            }else{
                if(order.length > i)
                    st.push(i);
                else 
                    break;
            }
            i++;
            if(orderIdx >= order.length) break;
            
        }
        return answer;
    }
}