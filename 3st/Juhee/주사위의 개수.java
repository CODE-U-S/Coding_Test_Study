class Solution {
    public int solution(int[] box, int n) {
        int a=box[0]/n;
        int b=box[1]/n;
        int x=box[2]/n;
        return a*b*x;
    }
}