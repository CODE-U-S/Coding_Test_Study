class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }
        return answer;
    }
}

public class AddYinAndYang {
    public static void main(String args[]) {
        int[] a = {4, 7, 12};
        boolean[] b = {true, false, true};
        int answer;
        Solution s = new Solution();
        answer = s.solution(a, b);
        System.out.println(answer);
    }
}