class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String my = my_string.substring(0, s);
		answer = my + overwrite_string;
		int last = answer.length();
		String last_String = my_string.substring(last);
		answer += last_String;
        return answer;
    }
}
