import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int j = 1; j <= 9; j++) {
            System.out.println(num + " * " + j + " = " + (num * j));
        }
    }
}