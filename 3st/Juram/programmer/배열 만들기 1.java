class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int num = k;
        for(int i = 0; i < answer.length; i++){
            answer[i] = k;
            k = k+num;
                
        }
        return answer;
    }
}