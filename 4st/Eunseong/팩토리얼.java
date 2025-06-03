class Solution {
    public int solution(int n) {
        int i = 1, answer = 1;
        
        while (answer <= n) {
            answer *= i++;
        }
        
        return i - 2;
    }
}