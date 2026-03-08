class Solution {
    public int solution(int n) {
        for(int x = 1; x < n; x++){
            if(n % x == 1){
                return x;
            }
        }
        return 0;
    }
}