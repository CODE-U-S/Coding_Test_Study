class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStart = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer.append(c);
                isStart = true;
            } else {
                if (isStart) {
                    answer.append(Character.toUpperCase(c));
                    isStart = false;
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        return answer.toString();
    }
}