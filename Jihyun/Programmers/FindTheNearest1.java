package Programmers;

class Solution {
    public int solution(int[] str, int idx) {
        int answer = -1;
        for(int i = idx; i < str.length; i++) 
        	if(str[i] == 1) {
        		answer = i;
        		break;
        	}
        
        return answer;
    }
}

public class FindTheNearest1 {
    public static void main(String args[]) {
        int[] str = {0, 0, 0, 1};
        int idx = 3;
        Solution s = new Solution();
        int answer = s.solution(str, idx);
        System.out.println(answer);
    }
}