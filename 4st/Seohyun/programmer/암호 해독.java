class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=code; i<=cipher.length(); i+=code) {
            answer.append(cipher.charAt(i-1));
        }
        return answer.toString();
    }
}