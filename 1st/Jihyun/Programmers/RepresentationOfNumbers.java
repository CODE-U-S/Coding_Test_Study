class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            int temp = 0;
            for(int j = i; j <= n; j++) {
                temp += j;
                if(temp == n) {
                    answer++;
                    break;
                }
                else if(temp > n)
                    break;
            }
        }
        return answer;
    }
}

public class RepresentationOfNumbers {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(15));	 // 4
	}
} 