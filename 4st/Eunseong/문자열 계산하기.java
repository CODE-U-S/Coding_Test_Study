import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean isPlus = true;
        String pol[] = my_string.split(" ");
        for (int i = 0; i < pol.length; i++) {
            if (i % 2 == 1) {
                if (pol[i].equals("+")) {
                    isPlus = true;
                } else {
                    isPlus = false;
                }
            } else {
                if (isPlus) {
                    answer += Integer.valueOf(pol[i]);
                } else {
                    answer -= Integer.valueOf(pol[i]);
                }
            }
        }
        return answer;
    }
}