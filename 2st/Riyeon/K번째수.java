import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int k=0;
        for(int[] cm : commands){
            int[] arr = Arrays.copyOfRange(array, cm[0]-1, cm[1]);
            Arrays.sort(arr);
            answer[k++] = arr[cm[2]-1];
        }
        return answer;
    }
}