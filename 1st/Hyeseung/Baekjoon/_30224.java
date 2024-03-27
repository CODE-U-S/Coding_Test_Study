import java.util.Scanner;

public class _30224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if((N + "").contains("7")) {
            if (N % 7 == 0) System.out.println(3);
            else System.out.println(2);
        }

        else {
            if(N % 7 == 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}