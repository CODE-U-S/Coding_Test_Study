import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        int answer = 0, max = 0;
        for(int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if(max < count) {
                max = count;
                answer = number;
            }

            else if(max == count) answer = -1;

            map.put(number, count);
        }

        return answer;
    }
}