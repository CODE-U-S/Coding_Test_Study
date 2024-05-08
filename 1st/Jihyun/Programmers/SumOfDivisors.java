class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                answer += i;
        return answer;
    }
}

public class SumOfDivisors {
    public static void main(String args[]) {
        int a = 12;
        Solution s = new Solution();
        int result = s.solution(a);
        System.out.println(result);
    }
}
