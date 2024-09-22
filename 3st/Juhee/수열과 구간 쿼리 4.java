class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0 ; i < queries.length ; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int c = queries[i][2];
            for(int j = a ; j <= b ; j++) {
                if(j %c == 0) {
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }
}
