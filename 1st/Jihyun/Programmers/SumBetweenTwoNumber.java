class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = a; i <= b; i++)
            answer += i;
        return answer;
    }
}

public class SumBetweenTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Solution s = new Solution();
        long result = s.solution(a, b);
        System.out.println(result);
    }
}