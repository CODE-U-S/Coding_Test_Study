class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if (len % 2 == 1) {
            return s.substring(len / 2, len / 2 + 1);
        } else {
            return s.substring(len / 2 - 1, len / 2 + 1);
        }
    }
}