package Sunhee.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] currentStages = new int[N + 1];
        int[] clearStages = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            for (int j = 0; j < stages[i]; j++) {
                clearStages[j] += 1;
            }
            currentStages[stages[i] - 1] += 1;
        }

        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (currentStages[i] == 0 || clearStages[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                map.put(i + 1, (double) currentStages[i] / (double) clearStages[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream().mapToInt(i -> i).toArray();
    }
}