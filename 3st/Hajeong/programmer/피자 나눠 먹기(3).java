class Solution {
    public int solution(int slice, int n) {
        int answer;

        if (n % slice > 0) {
            answer = n / slice + 1;
        } else {
            answer = n / slice;
        }
        return answer;
    }
}