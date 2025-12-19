class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isJjaksu = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                isJjaksu = false;
                answer.append(" ");
            } else {
                String c = Character.toString(s.charAt(i));
                if (isJjaksu) {
                    answer.append(c.toLowerCase());
                } else {
                    answer.append(c.toUpperCase());
                }
                isJjaksu = !isJjaksu;
            }
        }
        return answer.toString();
    }
}