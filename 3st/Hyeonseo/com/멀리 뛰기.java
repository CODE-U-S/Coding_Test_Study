class Solution {
    public int solution(int n) {
		int answer = 0;
		int n1 = 1;
		int n2 = 0;
		for(int i = 1; i < n+1; i++) {
			answer = (n1 + n2) % 1234567;
			n2 = n1;
			n1 = answer;
		}
        return (int)answer;
    }
}