class Solution {
    public int solution(long num) {
        int i = 0;
        int answer = 0;
        if (i == 1) return 0;
        while(num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num *= 3;
                num++;
            }
            i++;
        }
        if (i > 500) {
            answer = -1; 
        } else {
            answer = i;
        }
            
        return answer;
    }
}