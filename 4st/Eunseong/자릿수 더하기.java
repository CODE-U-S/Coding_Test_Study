class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= 7; i++) {
            answer += n % 10;
            n /= 10;
        } 
        
        return answer; 
    }
}