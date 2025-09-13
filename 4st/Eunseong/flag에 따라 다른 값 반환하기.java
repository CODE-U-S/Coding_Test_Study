class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = (flag) ? a + b : a - b;
        return answer;
    }
}