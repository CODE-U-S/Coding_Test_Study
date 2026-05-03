class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length();
        for (int i = 0; i < num; i++) {
            if (i < num - 4) {
                answer += "*";
            } else {
                answer += phone_number.charAt(i);
            }
        }

        return answer;
    }
}