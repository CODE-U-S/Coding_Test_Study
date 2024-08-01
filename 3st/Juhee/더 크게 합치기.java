public class Solution {
    public int solution(int a, int b) {
        String c = String.valueOf(a);
        String d = String.valueOf(b);
        String e = c + d;
        String f = d + c;

        int i = Integer.parseInt(e);
        int j = Integer.parseInt(f);

        if (i >= j) {
            return i;
        } 
        else {
            return j;
        }
    }