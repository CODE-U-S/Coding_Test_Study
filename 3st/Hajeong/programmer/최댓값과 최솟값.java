import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        int[] num = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            num[i] = Integer.parseInt(a[i]);
        }

        Arrays.sort(num);

        answer += num[0] + " " + num[num.length - 1];
        return answer;
    }
}