import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0, i;
        Arrays.sort(score);
        for (i = score.length - m; i >= 0; i -= m)
            answer += score[i] * m;

        return answer;
    }
}

public class Fruiterer {
    public static void main(String args[]) {
        int k = 3, m = 4;
        int[] score = { 1, 2, 3, 1, 2, 3, 1 };
        Solution s = new Solution();
        int answer = s.solution(k, m, score);
        System.out.println(answer);
    }
}