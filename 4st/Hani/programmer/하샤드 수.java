class Solution {
    public boolean solution(int x) {
        boolean answer = true;
         
        int one = 0;
        int ten = 0;
        
        one = x % 10;
        ten = (x / 10) % 10;
        
        int sum = one + ten;
        
        if (x % sum == 0) {
            answer = true;
        }
        else {
            answer = false;
        }
        
        return answer;
    }
}