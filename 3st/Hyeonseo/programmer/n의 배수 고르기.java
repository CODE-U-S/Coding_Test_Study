import java.util.*;
class Solution {
    public List<?> solution(int n, int[] numlist) {  
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }
        return answer;
    }
}
//level 0
