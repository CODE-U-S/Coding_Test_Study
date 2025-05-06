class Solution {
    public int solution(int n) {
        int result = 0; 
        
        for (int i = 4; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { 
                    result++; 
                    break; 
                }
            }
        }
        
        return result; 
    }
}