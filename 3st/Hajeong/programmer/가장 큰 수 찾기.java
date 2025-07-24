class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int n = array[0];
        int max = 0;
        for(int i = 1; i < array.length; i++) {
            
            if(n < array[i]) {
                n = array[i];
                max = i;
            }
        }
        answer[0] = n;
        answer[1] = max;
        return answer;
    }
}