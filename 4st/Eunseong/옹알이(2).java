class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            if (s.matches("(?:aya(?!aya)|woo(?!woo)|ye(?!ye)|ma(?!ma))+")) {
                answer++;
            }
        }
        return answer;
    }
}