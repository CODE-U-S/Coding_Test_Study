class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < queries.length; i++) {
            int temp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = temp;
        }

        return answer;
    }
}

public class SequenceAndIntervalQueries3 {
    public static void main(String args[]) {
        int[] a = { 0, 1, 2, 3, 4 };
        int[][] b = { { 0, 3 }, { 1, 2 }, { 1, 4 } };
        Solution s = new Solution();
        int[] result = s.solution(a, b);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}