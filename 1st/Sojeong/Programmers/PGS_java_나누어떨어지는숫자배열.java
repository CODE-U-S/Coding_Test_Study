package Sojeong.Programmers;

import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i : arr) {
            if(i % divisor == 0)
                answer.add(i);
        }
        
        Collections.sort(answer);
        
        if(answer.isEmpty())
            answer.add(-1);
        
        return answer;
    }
}
