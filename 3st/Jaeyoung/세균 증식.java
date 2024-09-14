class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int num = n;
        for(int i=0; i<t; i++){
            num*=2;
        }
        return num;
    }
}