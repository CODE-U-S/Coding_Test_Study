import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(" i    love  you"))); 
        System.out.println(Arrays.toString(solution.solution("    programmers  "))); 
    }
}