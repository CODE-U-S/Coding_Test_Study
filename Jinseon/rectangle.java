class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row = sizes[0][0], col = sizes[0][1];
        if(row < col){
            int temp = col;
            col = row;
            row = temp;
        }
        for(int i = 1; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
            if(sizes[i][0] > row) row = sizes[i][0];
            if(sizes[i][1] > col) col = sizes[i][1];
        }
        return answer = row * col;
    }
}