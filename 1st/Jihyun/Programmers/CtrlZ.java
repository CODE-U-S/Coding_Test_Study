class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] num = s.split(" ");
        for(int i = 0; i < num.length; i++) {
            if(!(num[i].equals("Z")))
                answer += Integer.parseInt(num[i]);
            else 
                answer -= Integer.parseInt(num[i - 1]);
        }
        return answer;
    }
}

public class CtrlZ {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution("1 2 Z 3"));  // 4
    }
}
