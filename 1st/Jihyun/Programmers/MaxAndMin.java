class Solution {
    public String solution(String s) {
        String answer = "";
        String max = Integer.toString(Integer.MIN_VALUE);
        String min = Integer.toString(Integer.MAX_VALUE);
        
        for(String i : s.split(" ")) {
            if(Integer.parseInt(i) > Integer.parseInt(max))
                max = i;
            if(Integer.parseInt(i) < Integer.parseInt(min))
                min = i;
        }
        
        answer = min + " " + max;
        return answer;
    }
}

public class MaxAndMin {
    public static void main(String[] args) {
        String a = "1 2 3 4";
        Solution s = new Solution();
        String answer = s.solution(a);
        System.out.println(answer);
    }
}
