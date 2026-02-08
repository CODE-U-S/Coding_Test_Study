import java.util.*;

class Solution {
    public String solution(int a, int b) {
        GregorianCalendar g = new GregorianCalendar(2016, a - 1, b);
        String answer[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        return answer[g.get(Calendar.DAY_OF_WEEK) - 1];
    }
}