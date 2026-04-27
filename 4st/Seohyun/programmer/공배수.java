class Solution {
    public int solution(int number, int n, int m) {
        int nn = number % n;
        int mm = number % m;
        if(nn == 0 && mm == 0){
            return 1;
        }
        return 0;
    }
}