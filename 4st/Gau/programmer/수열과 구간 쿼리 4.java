class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = arr;
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <=e; i++) {
                if (i%k == 0) {
                    answer[i] += 1;
                }
            }
        }
        
        return answer;
        
    }
}