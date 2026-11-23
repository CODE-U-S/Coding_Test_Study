import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        int[][] check = new int[maps.length][maps[0].length];
        int[][] distance = new int[maps.length][maps[0].length];
        int[][] vectors = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Deque<Coor> queue = new ArrayDeque<>();

        for (int i = 0; i < maps.length; i++) {
            System.arraycopy(maps[i], 0, check[i], 0, maps[i].length);
        }
        distance[0][0] = 1;
        
        queue.add(new Coor(0, 0));
        check[0][0] = 1;
        
        while (!queue.isEmpty()) {
            Coor cur = queue.poll();
            
            for (int[] vector : vectors) {
                int dx = cur.x + vector[1];
                int dy = cur.y + vector[0];

                if (dx >= 0 && dx < maps.length && dy >= 0 && dy < maps[0].length && check[dx][dy] == 1) {
                    queue.add(new Coor(dx, dy));
                    check[dx][dy] = 0;
                    distance[dx][dy] = (distance[dx][dy] == 0) ? distance[cur.x][cur.y] + 1 : Math.min(distance[dx][dy], distance[cur.x][cur.y]);
                }
            }
        }
        
        return (distance[maps.length - 1][maps[0].length - 1]) == 0 ? -1 : distance[maps.length - 1][maps[0].length - 1];
    }
}
class Coor {
    int x;
    int y;
    public Coor(int x, int y) {
        this.x = x;
        this.y = y;
    }
}