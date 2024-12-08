import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(String str : my_string.split("")) 
            if(str.matches("[A-Z]")) 
                answer[str.charAt(0) - 'A']++;
            else if(str.matches("[a-z]")) 
                answer[str.charAt(0) - 'a' + 26]++;
        
        return answer;
    }
}

public class CountingCharacter {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("Programmers")));  
        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
    }
}
