import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        LocalDate date = LocalDate.of(2016, a, b);
        int dayOfWeek = date.getDayOfWeek().ordinal();
        return week[dayOfWeek];
    }
}