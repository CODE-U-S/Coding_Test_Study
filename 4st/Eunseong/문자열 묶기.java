class Solution {
    public int solution(String[] strArr) {
        int cnt[] = new int[30];
        int max = 0;
        for (String i : strArr) {
            cnt[i.length() - 1]++;
        }
        for (int i = cnt.length - 1; i >= 0; i--) {
            if (cnt[i] > max) {
                max = cnt[i];
            }
        }
        return max;
    }
}