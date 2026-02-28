class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}