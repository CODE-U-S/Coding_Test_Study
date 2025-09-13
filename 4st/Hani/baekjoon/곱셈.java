import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int A = num2 / 100;    ///백의 자리
        int B = (num2 % 100) / 10;    ///십의 자리
        int C = num2 % 10;    ///일의 자리
        System.out.println(num1 * C);
        System.out.println(num1 * B);
        System.out.println(num1 * A);
        System.out.println(num1 * num2);
    }
}