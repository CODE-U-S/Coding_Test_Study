import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        Arrays.sort(tangerine);
        
        for (int i : tangerine) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }
        
        ArrayList<Integer> li = new ArrayList<>(hs.values());
        Collections.sort(li, Collections.reverseOrder());
        
        int sum = 0;
        int answer = 0;
        for (int i : li) {
            sum += i;
            answer++;
            if (sum >= k) {
                break;
            }
        }
        
        return answer;
    }
}