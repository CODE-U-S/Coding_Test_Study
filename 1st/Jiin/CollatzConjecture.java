class Solution {
    public int solution(int num) {
        if(num==1) return 0;
        
        int answer = 0;
        long number = num;
        
        do{
            if(number % 2==1){
                number = number*3 + 1;
            }else{
                number /= 2;
            }
            ++answer;
        }while(number!=1 && answer!=500);
        
        if(answer == 500) return -1;
        return answer;
    }
}
