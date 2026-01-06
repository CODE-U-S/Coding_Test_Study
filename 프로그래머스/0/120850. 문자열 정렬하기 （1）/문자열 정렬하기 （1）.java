import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        int index = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= '0' && c <= '9') {
                answer[index] = c - '0';
                index++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}