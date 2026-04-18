class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return getDungeonsCnt(dungeons, k, visited, 0);
    }
    public int getDungeonsCnt(int[][] dungeons, int k, boolean[] visited, int cnt) {
        int maxCnt = cnt;
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (k < dungeons[i][0]) {
                continue;
            }
            visited[i] = true;
            maxCnt = Math.max(maxCnt, getDungeonsCnt(dungeons, k - dungeons[i][1], visited, cnt + 1));
            visited[i] = false;
        }
        return maxCnt;
    }
}