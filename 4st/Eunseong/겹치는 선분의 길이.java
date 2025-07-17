class Solution {
    public int solution(int[][] lines) {
        int numline[] = new int[201];
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
                numline[j]++;
            }
        }
        int truecnt = 0;
        for (int i : numline) {
            if (i >= 2) truecnt++;
        }
        return truecnt;
    }
}