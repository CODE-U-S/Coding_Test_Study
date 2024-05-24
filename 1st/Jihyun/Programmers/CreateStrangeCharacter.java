class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] str = s.split("");
        int cnt = 0;
        for(String i : str) {
            if(i.equals(" ")) {
                cnt = 0;
                answer += i;
            }
            else {
                if(cnt % 2 == 0)
                    answer += i.toUpperCase();
                else
                    answer += i;
                cnt++;
            }
        }

        return answer;
    }
}

public class CreateStrangeCharacter {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution("try hello world"));  // TrY HeLlO WoRlD
    }
}