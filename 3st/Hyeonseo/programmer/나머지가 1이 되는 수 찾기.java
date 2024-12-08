class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(true) {
            if(n % i == 1) {
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }
}
// level 1
