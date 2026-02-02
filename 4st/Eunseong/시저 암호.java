class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer.append(" ");
            } else {
                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    answer.append((char)((c - 'A' + n) % 26 + 'A'));
                } else {
                    answer.append((char)((c - 'a' + n) % 26 + 'a'));
                }
            }
        }
        return answer.toString();
    }
}