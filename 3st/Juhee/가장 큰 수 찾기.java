class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};
        for (int i = 0; i < array.length; i++) {
        	if(array[i]>answer[0]) {
        		answer[0]=array[i];
        		answer[1]=i;
        	}
		}
        return answer;
    }
}