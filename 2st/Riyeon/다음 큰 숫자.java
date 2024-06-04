class Solution {
    public int solution(int n) {
        int s = Integer.bitCount(n), num=Integer.bitCount(++n);
        while(s!=num){
            num = Integer.bitCount(++n);
        }
        return n;
    }
}