package Sojeong.Programmers;

import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1)
                answer.add(i);
        }
        
        return answer;
    }
}
