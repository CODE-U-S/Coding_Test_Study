import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(s1));
        int count = 0;

        for (String str : s2) {
            if (set1.contains(str)) {
                count++;
            }
        }
        return count;
    }
}