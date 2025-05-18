import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a = 0;

        for(int i = 1; i < 10; i++) { // 1 ~ 9
            a = i * num;
            System.out.println(num + " * " + i + " = " + a);

        }
    }
}