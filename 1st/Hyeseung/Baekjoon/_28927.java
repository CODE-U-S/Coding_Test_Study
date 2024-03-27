import java.util.Scanner;

public class _28927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = sc.nextInt() * 3 + sc.nextInt() * 20 + sc.nextInt() * 120;
        int Mel = sc.nextInt() * 3 + sc.nextInt() * 20 + sc.nextInt() * 120;
        System.out.println(Max > Mel ? "Max" : Max == Mel ? "Draw" : "Mel");
    }
}