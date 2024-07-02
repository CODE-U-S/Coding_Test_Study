import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int b = budget;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            if(b - d[i] < 0)
                break;
            b -= d[i];
            answer++;
        }
        return answer;
    }
}

class Budget {
	public static void main(String[] args) {
		int[] a = {1,3,2,5,4};
		int b = 9;
		Solution s = new Solution();
		int answer = s.solution(a, b);
		System.out.println(answer);	 // 3
	}
}