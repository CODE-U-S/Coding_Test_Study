class Solution {
    public int solution(int n) {
        int answer = 0;
        int num =0;
        
        num = (int)Math.sqrt(n);
        
        if(num * num == n){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}