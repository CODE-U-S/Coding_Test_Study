package Programmers;

class Solution {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		for(int i = 0; i < n; i++)
            answer[i] = x * (i + 1);
		return answer;
	}
}

public class nNumbersAddedByX {
	public static void main(String[] args) {
		long x = 2;
        int n = 5;
        Solution s = new Solution();
        long[] answer = s.solution(x, n);
        for(int i = 0; i < answer.length; i++)
			System.out.println(answer[i]);
	}
}