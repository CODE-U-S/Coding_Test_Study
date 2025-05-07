class Solution {
    public int solution(int n) {
        int i = 1;        
        int answer = 1; 
        
        while (answer <= n) { 
            i++;
            answer *= i; 
            if (answer > n) { 
                return i - 1; 
            }
        }
        return i - 1; 
    }
}