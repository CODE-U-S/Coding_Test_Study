class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 1; j <= n; j++) {
                answer += String.valueOf(my_string.charAt(i));
            }
        }
        
        return answer;
    }
}