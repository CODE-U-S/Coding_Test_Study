class Solution {
    public int solution(int n) {
        int answer = 0;
       int a = (int)Math.sqrt(n);   
        if (a * a == n){
            answer=1;
        }
        else{
            answer=2;
        }
        
        return answer;
    }
}
