import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        Deque<String> cache = new ArrayDeque<>();
        int answer = 0;
        
        for (int i = 0; i < cities.length; i++) {
            String curCity = cities[i].toLowerCase();
            if (cache.contains(curCity)) {
                answer++;
                cache.remove(curCity);
                cache.add(curCity);
                continue;
            } else {
                answer += 5;
            }
            if (cache.size() < cacheSize) {
                cache.add(curCity);
            } else {
                if (cacheSize != 0) {
                    cache.poll();
                    cache.add(curCity);
                }
            }
        }
        return answer;
    }
}