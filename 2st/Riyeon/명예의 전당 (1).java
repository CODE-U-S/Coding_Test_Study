import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            int[] arr = Arrays.copyOfRange(score, 0, i+1);
            Arrays.sort(arr);
            if(arr.length < k)
                answer[i] = arr[0];
            else
                answer[i] = arr[arr.length-k];
        }
        return answer;
    }
}