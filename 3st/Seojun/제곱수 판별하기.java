class Solution {
    public int solution(int n) {
        
        double sqrt = Math.sqrt(n);
        
        if (sqrt == (int) sqrt) {
            return 1;
        } else {
            return 2; 
        }
    }
}
