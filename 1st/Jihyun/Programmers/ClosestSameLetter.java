import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = -1;
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
        }
        return answer;
    }
}

public class ClosestSameLetter {
	public static void main(String[] args) {
		Solution s = new Solution();
		String a = "banana";
		System.out.println(Arrays.toString(s.solution(a)));	 // [-1, -1, -1, 2, 2, 2]
	}
} 
