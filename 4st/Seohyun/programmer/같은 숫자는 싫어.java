import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        
        arrlist.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
            if (arr[i-1] != arr[i]){
                arrlist.add(arr[i]);
            }
        }
        
        answer = new int[arrlist.size()];
        
        for(int i=0; i<arrlist.size(); i++) {
            answer[i] = arrlist.get(i);
        }
        
        return answer;
    }
}