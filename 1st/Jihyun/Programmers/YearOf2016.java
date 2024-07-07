import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        LocalDate date = LocalDate.of(2016, a, b);
        answer = day[date.getDayOfWeek().getValue() - 1];
        return answer;
    }
}

public class YearOf2016 {
    public static void main(String[] args) {
        Solution s = new Solution();
	    System.out.println(s.solution(5, 24));	 // "TUE"
    }
}
