package Sunhee.programmers;

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int n : d) {
            if (budget - n >= 0) {
                answer++;
                budget -= n;
            } else {
                break;
            }
        }


        return answer;
    }
}