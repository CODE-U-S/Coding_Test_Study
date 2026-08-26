class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (i < s) {
                answer += my_string.charAt(i);
            }
            else if (i >= s && i <= e) {
                for (int j = e; j >= s; j--) {
                     answer += my_string.charAt(j);
                }
                i = e;
            }
            else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}