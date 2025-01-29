import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        int[] answer = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            answer[i] = divisors.get(i);
        }
        
        return answer;
    }
}
