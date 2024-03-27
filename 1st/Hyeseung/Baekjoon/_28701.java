import java.util.Scanner;

public class _28701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum1 = 0, sum2 = 0;

        for(int i = 1; i <= N; i++) {
            sum1 += i;
            sum2 += i * i * i;
        }

        System.out.println(sum1 + "\n" + (sum1 * sum1) + "\n" + sum2);
    }
}