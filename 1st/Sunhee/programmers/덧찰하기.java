package Sunhee.programmers;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        boolean[] repainted = new boolean[n + 1];
        
        for (int i = 0; i < section.length; i++) {
            repainted[section[i]] = true; 
        }
        
        for (int j = 1; j <= n; j++) {
            if (repainted[j]) { 
                answer++; 
                j += m - 1; 
            }
        }
        
        return answer;
    }
}
