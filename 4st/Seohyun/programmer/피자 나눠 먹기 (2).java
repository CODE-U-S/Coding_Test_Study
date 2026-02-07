class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=0;
        
        while(true) {
            i++;
            if ((i*6)%n==0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}