class Solution {
    public long solution(long n) {
        long answer = -1;
        if(Math.sqrt(n) % 1 == 0) {
            answer = (long)Math.pow(Math.sqrt(n)+1,2);
        }
        return answer;
    }
}