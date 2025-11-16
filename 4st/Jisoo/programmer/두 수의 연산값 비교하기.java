class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int d=1,t=b;
        while(t>0){
            d*=10;t/=10;
        }
        int ab=a*d+b,abb=2*a*b;
    
       
        return ab>=abb?ab:abb;
    }
}