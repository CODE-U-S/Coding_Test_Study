import java.util.Scanner;

public class 곱셈 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int mul = num1 * num2;
        
        while (num2 != 0) {
            System.out.println(num1 * (num2 % 10));
            num2 /= 10;
        }
        System.out.println(mul);
    }
}