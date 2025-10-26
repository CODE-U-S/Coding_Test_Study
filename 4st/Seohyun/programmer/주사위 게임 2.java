class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && b!=c && a!=c) //세 값이 모두 다를 때
            answer=a+b+c;
        else if(a==b && b==c)   //세 값이 모두 같을 때
            answer=3*a*(3*(a*a))*(3*(a*a*a));
        else
            answer= (a+b+c)*((a*a)+(b*b)+(c*c));
        return answer;
    }
}