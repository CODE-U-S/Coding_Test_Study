class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int top3[] = new int[3];
        int cnt = 0;
        
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (rank[j] == i + 1) {
                    if (attendance[j]) {
                        top3[cnt++] = j;
                    }
                    break;
                }
            }
            if (cnt == 3) {
                break;
            }
        }

        return 10000 * top3[0] + 100 * top3[1] + top3[2];
    }
}