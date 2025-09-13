import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        int max = -10000, min = 10000;
        
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(Integer.valueOf(nums[i]), max);
            min = Math.min(Integer.valueOf(nums[i]), min);
        }
        
        answer += min + " " + max;
        
        return answer;
    }
}