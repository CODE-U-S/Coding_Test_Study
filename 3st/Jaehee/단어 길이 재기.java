import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        if (num.matches("[a-zA-Z]+")) {
            System.out.println(num.length());
        } else {
            System.out.println();
        }
    }
}