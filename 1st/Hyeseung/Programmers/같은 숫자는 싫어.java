package Hyeseung.Programmers;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        int value = 10;

        for (int a : arr) {
            if (a != value)
                answerList.add(a);
            value = a;
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
