import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int num = 0, sum = 45;
        
        for(int i = 0; i < numbers.length; i++){
            num += numbers[i];
        }
        if(sum != num) answer = sum - num;
        return answer;
    }
}