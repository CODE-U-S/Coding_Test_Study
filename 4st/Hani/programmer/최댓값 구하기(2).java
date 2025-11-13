import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int small = numbers[0] * numbers[1];
        int big = numbers[numbers.length - 2] * numbers[numbers.length-1];
        
        if (small > big) 
            answer = small;
        else
            answer = big;
        
        return answer;
    }
}