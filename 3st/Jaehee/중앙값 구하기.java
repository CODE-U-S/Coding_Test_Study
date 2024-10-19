import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length / 2];
        return answer;
    }
}