class Solution {
    public int solution(int order) {
        String s = Integer.toString(order);
        int answer = 0;

        for (char c : s.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        return answer;
    }
}
