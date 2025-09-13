class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for (int i = 0; i <= cipher.length() - 1; i ++) {
            if ((i + 1) % code == 0) {
                answer += cipher.charAt(i);
            } else {
                continue;
            }
        }
        
        return answer;
    }
}