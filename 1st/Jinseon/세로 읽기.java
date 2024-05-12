class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}
