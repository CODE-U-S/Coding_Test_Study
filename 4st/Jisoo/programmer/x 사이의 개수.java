class Solution {
    public int[] solution(String s) {
        int x = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'x') x++;

        int[] a = new int[x + 1];
        int idx = 0, len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                a[idx++] = len;
                len = 0;
            } else len++;
        }
        a[idx] = len;
        return a;
    }
}
