class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = String.valueOf(age);
        for (int i = 0; i < temp.length(); i++) {
            char ch = (char)(temp.charAt(i) - '0' +'a');
            answer += ch;
        }
        return answer;
    }
}