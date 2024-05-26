class Solution {
    public int solution(int[][] sizes) {
        int w=0, h=0;
        for(int[] s : sizes){
            if(s[0] < s[1]){
                int temp = s[0];
                s[0] = s[1];
                s[1] = temp;
            }
            if(w<s[0]) w = s[0];
            if(h<s[1]) h = s[1];
        }
        return w*h;
    }
}