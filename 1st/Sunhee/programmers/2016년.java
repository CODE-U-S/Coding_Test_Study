package Sunhee.programmers;

class Solution {
    public String solution(int a, int b) {
        int[] months = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] weekday = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
        int days = b;
        
        for(int i=0; i < a; i++)
            days += months[i];
        
        return weekday[days % 7];
    }
}