import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++)
            answer[i] = (i % 2 == 0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        
        return answer;
    }
}

public class ConvertStringCaseInArray {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] a = {"AAA","BBB","CCC","DDD"};
		System.out.println(Arrays.toString(s.solution(a)));	 // ["aaa","BBB","ccc","DDD"]
	}
} 
