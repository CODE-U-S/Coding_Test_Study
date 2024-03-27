import java.util.Scanner;

public class _30007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++) {
            int A = sc.nextInt(), B = sc.nextInt();
            System.out.println(A * (sc.nextInt() - 1) + B);
        }
    }
}