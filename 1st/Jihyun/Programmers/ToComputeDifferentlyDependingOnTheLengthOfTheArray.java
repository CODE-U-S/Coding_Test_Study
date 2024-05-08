class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        for (int i = (arr.length + 1) % 2; i < arr.length; i += 2) {
            answer[i] += n;
        }
        return answer;
    }
}

public class ToComputeDifferentlyDependingOnTheLengthOfTheArray {
    public static void main(String args[]) {
        int[] a = { 49, 12, 100, 276, 33 };
        int b = 27;
        int[] answer;
        Solution s = new Solution();
        answer = s.solution(a, b);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
