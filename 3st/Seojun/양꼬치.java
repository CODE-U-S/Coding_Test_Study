class Solution {
    public int solution(int n, int k) {
        int total = n*12000 + k*2000;
        int answer;
      
      
            if(n>=0){  
                int count=n/10;
                
           
                total-=(2000*count);      
            }
       
        answer = total;
        return answer;
       
    }
}