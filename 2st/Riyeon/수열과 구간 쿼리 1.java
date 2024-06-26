class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries){
            for(int i = q[0]; i<q[1]+1; i++)
                arr[i]++;
        }
        return arr;
    }
}