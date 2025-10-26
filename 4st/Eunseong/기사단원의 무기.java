class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int numbers[] = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                numbers[j]++;
            }
        }
        for (int i : numbers) {
            answer += (i > limit) ? power : i;
        }
        return answer;
    }
}