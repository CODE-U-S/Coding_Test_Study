import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = s;
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        HashMap<String, Integer> n = new HashMap<String, Integer>();
        for(int i = 0; i < nums.length; i++)
            n.put(nums[i], i);
        
        for(int i = 0; i < n.size(); i++)
            answer = answer.replaceAll(nums[i], Integer.toString(n.get(nums[i])));
        
        return Integer.parseInt(answer);
    }
}

public class NumberStringsAndEnglishWords {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution("one4seveneight"));  // 1478
    }
}