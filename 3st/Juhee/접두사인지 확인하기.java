class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int len = is_prefix.length();

        if (my_string.length() < len) {
            return answer;
        }
        for (int i = 0; i < len; i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) {
                return answer;
            }
        }
        answer = 1;
        return answer;
    }
}
