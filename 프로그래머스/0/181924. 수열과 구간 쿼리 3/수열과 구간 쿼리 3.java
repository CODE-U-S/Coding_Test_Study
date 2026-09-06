class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr; // [0, 1, 2, 3, 4]
        // [0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2];
        
        int temp = 0;
        
        for (int i = 0; i < queries.length; i++) {
            temp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = temp;
            
        }
        return answer;
    }
}