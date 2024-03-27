package Programmers;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] str = my_string.toCharArray();
        for(int i = 0; i < queries.length; i++) {
        	for(int j = queries[i][0], k = queries[i][1]; j < queries[i][1]; j++, k--) {
        		if(j >= k) break;
        		char temp = str[j];
        		str[j] = str[k];
        		str[k] = temp;
        	}
        }
        answer = String.valueOf(str);
        return answer;
    }
}

public class FlipStringMultipleTimes {
	public static void main(String args[]) {
		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		Solution s = new Solution();
		String result = s.solution(my_string, queries);
		System.out.println(result);
	}
}
