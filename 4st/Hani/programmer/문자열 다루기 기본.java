class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        int count = 0; //모든 문자가 숫자인지 아닌지 체크 문자열 길이와 같으면 true
        
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    count++;
                }
            }
        }
        
        if (count == s.length()) {
            answer = true;
        }
        return answer;
    }
}