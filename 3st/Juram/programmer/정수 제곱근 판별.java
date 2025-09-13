class Solution {
    public long solution(long n) {
        long answer = -1;
        if(Math.sqrt(n)%1==0){
            long s = (long)Math.sqrt(n)+1;
            answer = s*s;
        }
        else answer = -1;
        return answer;
    }
}