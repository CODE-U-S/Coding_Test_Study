class Solution {
    public int solution(int n) {
        int answer = 1;
        if(n % 7 == 0) answer = 0;
        return answer + n/7;
    }
}