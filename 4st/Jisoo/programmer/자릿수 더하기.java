class Solution {
    public int solution(int n) {
        int answer = 0;
       while(n>0){
           answer+=n%10;
           n/=10;
       }
        System.out.print(answer);
        return answer;
    }
}
