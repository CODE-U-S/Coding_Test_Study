import java.util.Scanner;

public class _31611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt() % 7;
        if(X == 2) System.out.println(1);
        else System.out.println(0);
    }
}