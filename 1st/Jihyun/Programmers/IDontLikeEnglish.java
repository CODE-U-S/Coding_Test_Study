import java.util.*;

class Solution {
    public long solution(String numbers) {
        String answer = numbers;
        String[] n = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        HashMap<String, Integer> nums = new HashMap<String, Integer>();
        for(int i = 0; i < 10; i++)
            nums.put(n[i], i);
        
        for(int i = 0; i < nums.size(); i++)
             answer = answer.replaceAll(n[i], Integer.toString(nums.get(n[i])));
        
        return Long.parseLong(answer);
    }
}

class IDontLikeEnglish {
	public static void main(String[] args) {
		String a = "onefourzerosixseven";
		Solution s = new Solution();
		long answer = s.solution(a);
		System.out.println(answer);	 // 14067
	}
} 