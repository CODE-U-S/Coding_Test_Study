class Solution {
    public int solution(int a, int b, int c) {
        if(a==b){
            if(b==c)
                return (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
            else
                return (a+b+c)*(a*a+b*b+c*c);
        }else if(a==c || b==c)
            return (a+b+c)*(a*a+b*b+c*c);
        else
            return a+b+c;
        
    }
}