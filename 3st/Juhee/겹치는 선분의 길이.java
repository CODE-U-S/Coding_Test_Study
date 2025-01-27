class Solution {
    public int solution(int[][] lines) {
        int[] rail = new int[200];
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                rail[j]++;
            }
        }

        int answer = 0;
        for (int value : rail) {
            if (value > 1) answer++;
        }
        return answer;
    }
}
