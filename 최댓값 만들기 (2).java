import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
 
        Arrays.sort(numbers);

        int maxProduct = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        int minProduct = numbers[0] * numbers[1];

        return Math.max(maxProduct, minProduct);
    }
}