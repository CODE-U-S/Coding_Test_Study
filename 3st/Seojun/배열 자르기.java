import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
   
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
