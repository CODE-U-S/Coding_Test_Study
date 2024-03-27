import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1924 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int month = Integer.parseInt(str[0]);
        int date = Integer.parseInt(str[1]);

        int[] dateInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] dayOfWeeks = "SUN,MON,TUE,WED,THU,FRI,SAT".split(",");

        for (int i = 0; i < month - 1; i++)
            date += dateInMonth[i];

        System.out.println(dayOfWeeks[date % 7]);
    }
}
