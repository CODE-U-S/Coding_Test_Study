class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        for (int i = 0; i < len - 1; i++) {
            int t = len - i - 1;
            for (int j = i + 1; j < len; j++) {
                if (prices[i] > prices[j]) {
                    t = j - i;
                    break;
                }
            }
            answer[i] = t;
        }
        return answer;
    }
}