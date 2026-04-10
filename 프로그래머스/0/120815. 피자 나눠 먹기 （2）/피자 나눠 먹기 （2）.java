class Solution {
    public int solution(int n) {
        int x = 1;
        
        while ((6 * x) % n != 0) {
            x++;
        }
        
        return x;
    }
}