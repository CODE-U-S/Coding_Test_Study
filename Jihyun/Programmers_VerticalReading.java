class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = c - 1; i < my_string.length(); i+=m) {
        	answer += my_string.charAt(i);
        }
        
        return answer;
    }
}

public class VerticalReading {
	public static void main(String args[]) {
        // 테스트
		String my_string = "dkHwldkelakdldjfkldkfdodjf";
		int m = 5;
		int c = 3;
		
		Solution s = new Solution();
		String answer = s.solution(my_string, m, c);
		System.out.println(answer);
	}
}