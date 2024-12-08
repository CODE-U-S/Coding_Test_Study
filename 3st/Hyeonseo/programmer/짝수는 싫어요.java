class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n/2 + n%2];
        for(int i = 0; i < answer.length;i++) {
            answer[i] = i*2+1;
        }
        return answer;
    }
}
