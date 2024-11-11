class Solution {
    public int solution(String dirs) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int answer = 0;
        int d=0, x=5, y=5;
        boolean[][][] visited = new boolean[11][11][4];
        
        for(char c : dirs.toCharArray()){
            switch(c){
                case 'U': d=0; break;
                case 'R': d=1; break;
                case 'D': d=2; break;
                case 'L': d=3;
            }
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx < 0 || nx > 10 || ny < 0 || ny > 10) continue;
            if(!visited[nx][ny][d]){
                visited[nx][ny][d] = true;
                visited[x][y][(d+2)%4] = true;
                answer++;
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
}