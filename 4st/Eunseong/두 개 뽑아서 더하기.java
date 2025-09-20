import java.util.TreeSet;
class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> h = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (i == j) continue;
                h.add(numbers[i] + numbers[j]);
            }
        }
        return h;
    }
}