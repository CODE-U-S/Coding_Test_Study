import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++)
                temp.add(array[j]);
            Collections.sort(temp);
            answer[i] = temp.get(commands[i][2] - 1);
        }

        return answer;
    }
}

public class KthNumber {
    public static void main(String args[]) {
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer;
        Solution s = new Solution();
        answer = s.solution(a, b);
        System.out.println(Arrays.toString(answer));  // [5, 6, 3]
    }
}