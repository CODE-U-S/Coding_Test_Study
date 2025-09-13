class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt < 0) {
                return false;
            }
        }
        
        answer = (cnt == 0) ? true : false;

        return answer;
    }
}