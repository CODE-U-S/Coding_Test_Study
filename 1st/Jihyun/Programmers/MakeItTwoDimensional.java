import java.util.Arrays;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int i = 0; i < num_list.length / n; i++)
            for(int j = 0; j < n; j++)
                answer[i][j] = num_list[i * n + j];
        return answer;
    }
}

public class MakeItTwoDimensional {
    public static void main(String args[]) {
        int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Solution s = new Solution();
        int[][] list = s.solution(num_list, 2);
        System.out.println(Arrays.toString(list));  // [[1, 2], [3, 4], [5, 6], [7, 8]]
    }
}
