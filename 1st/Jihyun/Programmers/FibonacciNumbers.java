class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0, b = 1;
        int m = 1234567;
        for (int i = 2; i <= n; i++) {
            answer = (a + b) % m;
            a = b;
            b = answer;
        }
        return answer;
    }
}

public class FibonacciNumbers {
	public static void main(String[] args) {
		int a = 3;
		Solution s = new Solution();
		int answer = s.solution(a);
		System.out.println(answer);  // 2
	}
}
