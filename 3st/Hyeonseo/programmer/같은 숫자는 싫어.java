import java.util.*;

public class Solution {
    public List<?> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]) {
                answer.add(arr[i]);
            }
        }     
        return answer;
    }
}
//level 1
