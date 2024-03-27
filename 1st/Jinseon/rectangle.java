import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row = 0, col = 0;
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > row) row = sizes[i][0];
            if(sizes[i][1] > col) col = sizes[i][1];
        }
        return answer = row * col;
    }
}