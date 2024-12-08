class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        for(int i=1; i<=10; i++){
            factorial *= i;
            
            if(factorial == n){
                answer = i;
                break;
            }
            else if(n < factorial){
                answer = (i-1);
                break;
            }
        }
        return answer;
    }
}
