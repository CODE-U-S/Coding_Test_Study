class Solution {
    public int solution(long num) {
        int answer = 0;
        
        if(num==1) return 0;
            
        while(num!=1){
            
            if(answer==500){
                return answer = -1;
            }
            
            if(num%2==0) {//짝수
                num = num/2;
                answer++;
            }
            else{//홀수
                num = num * 3 + 1;
                answer++;
            }
            
        }
    
    
        return answer;
    }
}