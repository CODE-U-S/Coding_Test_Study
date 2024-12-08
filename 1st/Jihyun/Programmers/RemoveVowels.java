class Solution {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[a|e|i|o|u]", "");
        
        return answer;
    }
}

public class RemoveVowels {
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("nice to meet you"));	 // "nc t mt y"
	}
}
