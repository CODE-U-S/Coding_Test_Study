import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        // 귤의 크기랑 개수 매핑
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        //개수를 내림차순으로 정렬
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        int sum = 0;
        
        for (int count : list) {
            sum += count;
            answer++;
            
            if (sum >= k) {
                break;
            }
        }
        
        
        return answer;
    }
}