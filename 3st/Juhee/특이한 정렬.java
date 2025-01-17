import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] order = new double[numlist.length];
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] - n < 0) {
                order[i] = ((int)Math.abs(numlist[i] - n)) + 0.5;
            }
            else {
                order[i] = numlist[i] - n; 
            }
        }
        
        Arrays.sort(order);
        
        for(int i = 0; i < numlist.length; i++) {
            if(order[i] % 1 != 0){
                answer[i] = n - (int)order[i];
            }
            else {
                answer[i] = (int)order[i] + n;
            }
        }
        
        return answer;
    }
}