class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(0, 0, numbers, target);
        return answer;
    }
    public void DFS(int level, int sum, int[] numbers, int target) {
        if (level == numbers.length) {
            if (sum == target) {
                answer++;
            }
            } else {
            DFS(level + 1, sum + numbers[level], numbers, target);
            DFS(level + 1, sum - numbers[level], numbers, target);
        }
    }
}