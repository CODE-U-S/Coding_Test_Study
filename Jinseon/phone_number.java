class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int star_number = phone_number.length() - 4;
        answer = "*".repeat(star_number) + phone_number.substring(star_number);
        return answer;
    }
}