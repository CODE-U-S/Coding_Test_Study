import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        if (x == sum) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}