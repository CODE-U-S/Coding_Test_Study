import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        double a = Math.pow(Arrays.stream(num_list).sum(), 2);
        double b = 1;
        for(int i : num_list)
            b *= i;

        if(a > b)
            answer = 1;
        return answer;
    }
}

public class NumberMultiplicationAndSum {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int answer;
        Solution s = new Solution();
        answer = s.solution(a);
        System.out.println(answer);
    }
}