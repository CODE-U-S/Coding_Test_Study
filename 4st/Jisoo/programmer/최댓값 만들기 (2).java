import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
           Arrays.sort(numbers); 
        int n = numbers.length;
        int case1 = numbers[n-1] * numbers[n-2]; // 가장 큰 두 수
        int case2 = numbers[0] * numbers[1];     // 가장 작은 두 수
        return Math.max(case1, case2);
    }
}