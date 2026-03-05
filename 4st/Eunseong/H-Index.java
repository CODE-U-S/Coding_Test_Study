import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int max = citations[citations.length - 1];
        
        for (int i = max; i >= 0; i--) {
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i) {
                    if (citations.length - j >= i) {
                        return i;
                    }
                }
            }
        }
        
        return 0;
    }
}