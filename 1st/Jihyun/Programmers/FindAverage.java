class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int a : arr)
            answer += a;
        answer /= arr.length;
        return answer;
    }
}

public class FindAverage {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = { 1, 2, 3, 4 };
        double answer = s.solution(arr);
        System.out.println(answer);
    }
}
