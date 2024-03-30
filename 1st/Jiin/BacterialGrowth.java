class Solution {
    public int solution(int n, int t) {
        double answer = Math.pow(2, t);
        answer *= n;
        return (int)answer;
    }
}
