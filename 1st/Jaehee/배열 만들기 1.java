import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> multiples = new ArrayList<>();
    
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                multiples.add(i);
            }
        }
        
        int[] answer = new int[multiples.size()];
        for (int i = 0; i < multiples.size(); i++) {
            answer[i] = multiples.get(i);
        }
        
        return answer;
    }
}