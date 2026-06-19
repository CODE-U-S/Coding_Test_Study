class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double x = Math.sqrt(n);
        
        if (x == (long)x) {
           if (x > 0) {
               answer += (x+1) * (x+1);
           }
            else {
                answer = -1;
            }
        }
        else {
            answer = -1;
        }
        return answer;
    }
}