class Solution {
    public int solution(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += c - '0'; // 문자 숫자로 변환 후 더하기
        }
        return sum % 9;
    }
}