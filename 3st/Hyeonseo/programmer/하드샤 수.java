class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        for(int i = 1; i <= 10000; i*=10) {
            sum += (x / i) % 10;
        }
        if(x % sum != 0) {
            answer = false; 
        }
        return answer;
    }
}
