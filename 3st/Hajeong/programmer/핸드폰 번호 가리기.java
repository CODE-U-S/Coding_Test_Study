class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] num = phone_number.toCharArray();

        for (int i = 0; i < num.length - 4; i++) {
            answer += '*';
        }
        for (int i = num.length - 4; i < num.length; i++) {
            answer += num[i];
        }
        return answer;
    }
}