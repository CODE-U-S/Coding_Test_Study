import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        long answer = 1;
        long day = sc.nextLong();
        long night = sc.nextLong();
        long width = sc.nextLong() - day;

        if(width > 0){
            long one_day = day-night;
            answer += width / one_day;
            if(width%one_day != 0) answer++;
        }

        System.out.println(answer);
    }
}
