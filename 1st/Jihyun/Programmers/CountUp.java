class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for (int i = 0; i <= end_num - start_num; i++)
            answer[i] = start_num + i;
        return answer;
    }
}

class CountUp {
    public static void main(String args[]) {
        int start = 3;
        int end = 10;
        Solution s = new Solution();
        int[] result = s.solution(start, end);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
