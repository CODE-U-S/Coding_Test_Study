package Hyeseung.Programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length > 10)
            answer = Arrays.stream(num_list).sum();
        else
            answer = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        return answer;
    }
}