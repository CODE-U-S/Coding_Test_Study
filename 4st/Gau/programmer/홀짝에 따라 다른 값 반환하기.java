class Solution {
    public int solution(int n) {
        int a = 0;
        if(n%2 == 1){
            for(int i=1;i<=n;i+=2){
                a += i;
            }
        }
        else{
            for(int i=2;i<=n;i+=2){
                a += i*i;
            }
        }
        return a;
    }
}