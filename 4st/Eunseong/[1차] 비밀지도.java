import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String map[] = new String[n];
        for (int i = 0; i < n; i++) {
            int num = arr1[i] | arr2[i];
            StringBuilder s = new StringBuilder();
            for (int j = n - 1; j >= 0; j--) {
                if ((num & (1 << j)) != 0) {
                    s.append("#");
                } else {
                    s.append(" ");
                }
            }
            map[i] = s.toString();
        }
        return map;
    }
}