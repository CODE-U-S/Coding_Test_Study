class Solution {
    public int solution(int n) {
        String s = "";
        while(n>0){
            s += n%3;
            n/=3;
        }
        return Integer.parseInt(s, 3);
    }
}