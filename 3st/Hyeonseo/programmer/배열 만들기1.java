class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = k*(i+1);
        }
        return answer;
    }
}