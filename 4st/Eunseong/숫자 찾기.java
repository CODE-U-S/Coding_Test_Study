class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int length = Integer.toString(num).length();
        for (int i = 1; i <= length; i++) {
            if (num % 10 == k) answer = length - i + 1;
            num /= 10;
        }
        return answer;
    }
}