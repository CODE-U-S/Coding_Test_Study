class Solution {
    public int solution(int n) {
        int[] tiles = new int[n+1];
        
        tiles[1] = 1;
        tiles[2] = 2;
        
        for(int i=3; i<=n; i++){
            tiles[i] = (tiles[i-1] + tiles[i-2]) % 1_000_000_007;
        }
        
        return tiles[n];
    }
}