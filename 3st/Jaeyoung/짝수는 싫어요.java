class Solution {
    public int[] solution(int n) {
        int[] answer;
        if (n % 2 == 0) {
            answer = new int[n / 2];
        } 
        else {
            answer = new int[(n + 1) / 2];
        }
        
        for (int i = 0; i < answer.length; i++) {
                answer[i] = (i * 2) + 1;
            }
        return answer;
    }
}