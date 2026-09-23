class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = 0;
        int num2=0;
        
        
        num1 = Integer.parseInt("" + a + b);
        num2 = Integer.parseInt("" + b + a);
        
        if(num1 > num2){
            answer = num1;
        }else {
            answer = num2;
        }
        
        return answer;
    }
}