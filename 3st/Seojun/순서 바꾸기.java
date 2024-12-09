import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] firstPart = Arrays.copyOfRange(num_list, 0, n);
      
        int[] secondPart = Arrays.copyOfRange(num_list, n, num_list.length);
       
        int[] answer = new int[num_list.length];
        System.arraycopy(secondPart, 0, answer, 0, secondPart.length);
        System.arraycopy(firstPart, 0, answer, secondPart.length, firstPart.length);
        
        return answer;
    }
}
