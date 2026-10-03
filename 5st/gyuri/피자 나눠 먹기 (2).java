class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(6 * answer % n != 0){
                answer++;
        }
        return answer;
    }
}