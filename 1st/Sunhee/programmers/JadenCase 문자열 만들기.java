package Sunhee.programmers;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isFirstChar = true;

        for (char c : s.toCharArray()) {
            if (isFirstChar) {
                answer.append(Character.toUpperCase(c));
                isFirstChar = false;
            } else {
                answer.append(Character.toLowerCase(c));
            }

            if (c == ' ') {
                isFirstChar = true;
            }
        }

        return answer.toString();
    }
}
