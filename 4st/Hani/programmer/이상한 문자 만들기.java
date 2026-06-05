class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += ' ';
                index = 0;
            }
            
            else {
                if (index % 2 == 0) {
                    answer += Character.toUpperCase(s.charAt(i));
                }
                else {
                    answer += Character.toLowerCase(s.charAt(i));
                }
                index++;
            }
            
        }
        return answer;
    }
}