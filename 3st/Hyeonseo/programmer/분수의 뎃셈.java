class Solution {
    public int[] solution(int c1, int p1, int c2, int p2) {
        int c3=c1*p2+c2*p1,p3=p1*p2;
        int g=gcd(c3,p3);
        return new int[]{c3/g,p3/g};
    }
    int gcd(int a,int b) {
        while(b!=0) {
            int tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
}