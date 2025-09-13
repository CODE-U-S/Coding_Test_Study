class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        
        int product = 2 * a * b;
        
        return Math.max(answer, product);
    }
}