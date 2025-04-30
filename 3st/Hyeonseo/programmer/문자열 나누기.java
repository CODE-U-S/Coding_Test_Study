class Solution {
    public int solution(String s) {
        int answer = 0;
        char ch[] = s.toCharArray();
        int x = 0;
        int x_cnt = 0;
        int xNot_cnt = 0;
        for(int i = 0; i < ch.length;i++) {
            if(ch[x] == ch[i]) {
                x_cnt++;
            }
            else {
                xNot_cnt++;
            }
            if(x_cnt == xNot_cnt) {
                answer++;
                if (i + 1 < ch.length) {
                    x = i + 1;
                }
                x_cnt = 0;
                xNot_cnt = 0;
            }
        }
         if (x_cnt != xNot_cnt) answer++;
        return answer;
    }
}