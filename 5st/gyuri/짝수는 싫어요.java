class Solution {
    public int[] solution(int n) {
        
        int[] answer = new int[(n+1)/2];
        
        int sum=0;
        for(int i = 0; i < answer.length; i++){
            answer[i] = (1 + 2*i);
            }
        return answer;
    }
}