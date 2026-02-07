import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int answer[] = new int[s.length()];
        int last[] = new int[26];
        
        Arrays.fill(last, -1);
        
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            
            if (last[index] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - last[index];
            }
            
            last[index] = i;
        }
        
        return answer;
    }
}