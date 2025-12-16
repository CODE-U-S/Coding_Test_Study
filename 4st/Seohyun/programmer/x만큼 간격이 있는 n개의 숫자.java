import java.util.List;
import java.util.ArrayList;
class Solution {
    public Long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            list.add((long)x*i);
        }
        Long[] answer = new Long[n];
        return list.toArray(answer);
    }
}