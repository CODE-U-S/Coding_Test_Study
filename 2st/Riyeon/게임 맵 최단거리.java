import java.util.*;
class Solution {
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};
    
    public void bfs(int[][] maps, int[][] visited){
        visited[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        
        while(!queue.isEmpty()){
            int[] current = queue.remove();
            int cx = current[0];
            int cy = current[1];
            
            for(int i=0; i<4; i++){
                int x = cx + dx[i];
                int y = cy + dy[i];
                if(x<0 || x>maps.length-1 || y<0 || y>maps[0].length-1)
                    continue;
                if(visited[x][y]==0 && maps[x][y]==1){
                    visited[x][y] = visited[cx][cy]+1;
                    queue.add(new int[]{x, y});
                    
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        
        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];
        if(answer == 0)
            answer = -1;
        return answer;
    }
}