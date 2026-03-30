class Solution {
    public int solution(int n, int m, int[] section) {
        int chillCount = 0;
        if (section.length == 1) return 1;
        int chill = section[0];
        for (int i = 1; i < section.length; i++) {
            if (section[i] - chill >= m) {
                chillCount++;
                chill = section[i];
            }
        }
        return chillCount + 1;
    }
}