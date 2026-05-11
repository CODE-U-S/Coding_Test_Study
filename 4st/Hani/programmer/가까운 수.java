import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int temp = Math.abs(array[0] - n);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                if (array[i] - n < temp) {
                    temp = array[i] - n;
                    index = i;
                }
            }
            else if (array[i] < n) {
                if (n - array[i] < temp) {
                    temp = n - array[i];
                    index = i;
                }
            }
            if (array[i] == n) {
                return n;
            }
            
            int diff = Math.abs(array[i] - n);
            if (diff < temp) {
                temp = diff;
                index = i;
            } else if (diff == temp && array[i] < array[index]) {
                index = i;
            }
        }
        
        
        
        answer = array[index];
        return answer;
    }
}