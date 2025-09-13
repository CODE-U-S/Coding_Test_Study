import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int mindif = 100;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - n) < mindif) {
                answer = array[i];
                mindif = Math.abs(array[i] - n);
            }
        }
        return answer;
    }
}