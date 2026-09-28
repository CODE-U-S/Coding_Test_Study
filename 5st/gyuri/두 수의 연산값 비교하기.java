class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        String strnum = str1 + str2;
        
        int num1 = Integer.parseInt(strnum);
        int num2 = 2 * a * b;
        
        if(num1 < num2){
            answer = num2;
        }else{
            answer = num1;
        }
        
        return answer;
    }
}