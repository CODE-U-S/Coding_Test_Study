import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        int max=0;
        int a=0;
        for(int i=0;i<n;i++){
            max=numbers[i];
            a = numbers[n-2];
        }
        int answer = a*max;
        return answer;
    }
}