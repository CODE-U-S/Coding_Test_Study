class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int max = 0;
        for(int i =1; i<=a; i++){
            if(a%i ==0 && b%i ==0) max= i;
        }

        b /= max;

        while(b>1){
            if(b%2==0){
                b /= 2;
            }else if(b%5==0){
                b /= 5;
            }else {
                return 2;
            }
        }

        return answer;
    }
}