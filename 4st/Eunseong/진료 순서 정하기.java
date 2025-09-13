class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int top;
        
        for (int i = 0; i < emergency.length; i++) {
            top = 1;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] > emergency[i]) top++;
            }
            answer[i] = top;
        }
        return answer;
    }
}