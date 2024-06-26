class Solution {
    public String solution(int a, int b) {
        String[] str = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        // 2016년 2월은 29일까지.
        int[] mon = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int num = 0;
        for(int i=0; i<a; i++){
            num += mon[i];
        }
        return str[(num+b)%7];
    }
}