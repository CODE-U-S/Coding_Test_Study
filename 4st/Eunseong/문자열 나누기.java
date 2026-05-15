class Solution {
    public int solution(String s) {
        int answer = 0;
        char curC = s.charAt(0);
        int cCnt = 1;
        int oCnt = 0;
        
        for (int i = 1; i < s.length(); i++) {
            if (cCnt == 0) {
                curC = s.charAt(i);
                answer++;
            }
            if (curC == s.charAt(i)) {
                cCnt++;
            } else {
                oCnt++;
            }
            if (cCnt == oCnt) {
                cCnt = 0;
                oCnt = 0;
            }
        }
        
        return answer + 1;
    }
}