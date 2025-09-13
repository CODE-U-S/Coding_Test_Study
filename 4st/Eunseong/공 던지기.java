class Solution {
    public int solution(int[] numbers, int k) {
        int answer = numbers[(k * 2 - 2) % numbers.length];
        return answer;
    }
}