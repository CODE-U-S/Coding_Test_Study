import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int socre = sc.nextInt();

        if (socre >= 90) {
            System.out.println("A");
        } else if (socre >= 80) {
            System.out.println("B");
        } else if (socre >= 70) {
            System.out.println("C");
        } else if (socre >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}