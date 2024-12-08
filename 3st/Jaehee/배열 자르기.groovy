class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // num1번째 인덱스부터 num2번째 인덱스까지 자르기
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}