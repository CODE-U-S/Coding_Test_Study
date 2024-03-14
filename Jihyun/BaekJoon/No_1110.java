package BaekJoon;
import java.util.Scanner;

public class No_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int cnt = 0;
        do {
            b = ((b % 10) * 10) + ((b % 10 + b / 10) % 10);
            cnt++;
        }while(a != b);

        System.out.println(cnt);
    }
}