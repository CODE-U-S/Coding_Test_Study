import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(1); 
        return list.stream().mapToInt(i -> i).toArray();
    }
}
