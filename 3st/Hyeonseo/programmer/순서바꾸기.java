class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
		int n1 = n -1;
		for (int i = n; i < num_list.length; i++) {
			answer[i-n] = num_list[i];
			}
		
		for (int j = 0; j < n; j++) {
			answer[num_list.length -1 - n1] = num_list[j];
			n1--;
		}

        return answer;
    }
}