class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        
        String snum = sa + sb;
        int num = Integer.parseInt(snum);
        
        if (num < (2 * a * b)) {
            answer = (2 * a * b);
        } 
        else if (num > (2 * a * b) || num == (2 * a * b)) {
            answer = num;
        }
        return answer;
    }
}