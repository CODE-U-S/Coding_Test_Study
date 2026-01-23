class Solution {
    public int solution(int n) {
        int i = n;
        int nc = count1(n);
        while (true) {
            if (nc == count1(++i)) {
                break;
            }
        }
        return i;
    }
    int count1(int n) {
        int cnt = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}