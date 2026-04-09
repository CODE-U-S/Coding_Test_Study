import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }
        for (int i = 0; i < discount.length - 9; i++) {
            for (int j = 0; j < want.length; j++) {
                if (map.getOrDefault(want[j], 0) < number[j]) {
                    break;
                }
                if (j == want.length - 1) {
                    answer++;
                }
            }
            if (i == discount.length - 10) break;
            map.replace(discount[i], map.getOrDefault(discount[i], 0) - 1);
            map.put(discount[10 + i], map.getOrDefault(discount[10 + i], 0) + 1);
        }
        return answer;
    }
}