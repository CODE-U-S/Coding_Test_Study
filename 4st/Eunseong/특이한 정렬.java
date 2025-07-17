import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        int answer[] = new int[numlist.length];
        int dif = -1;
        int minI = -1;
        for (int i = 0; i < numlist.length; i++) {
            minI = 0;
            dif = 10000;
            for (int j = 0; j < numlist.length; j++) {
                if (numlist[j] == 0) continue;
                int tempdif = Math.abs(numlist[j] - n);
                if (tempdif <= dif) {
                    dif = tempdif;
                    minI = j;
                }
            }
            answer[i] = numlist[minI];
            numlist[minI] = 0;
        }
        return answer;
    }
}