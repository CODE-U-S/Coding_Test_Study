class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int nums : array) {
            if (nums == n) {
                answer++;
            }
        }
        
        return answer;
    }
}