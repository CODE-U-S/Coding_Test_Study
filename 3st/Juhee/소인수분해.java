import java.util.ArrayList;
class Solution {
    public ArrayList solution(int n) {
        ArrayList answer = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                answer.add(i);
            }
        }
        return answer;
    }
}
