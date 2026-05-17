import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        for (int i = 0; i <= 9; i++) {
            boolean find = false;
            
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    find = true;
                    break;
                }
            }
            
            if (!find) {
                answer += i;
            }
        }
        
        return answer;
    }
}