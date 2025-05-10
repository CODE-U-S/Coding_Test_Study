import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int coordinate_x = sc.nextInt();
        int coordinate_y = sc.nextInt();

        if (coordinate_x > 0 && coordinate_y > 0) {
            System.out.println("1");
        } else if (coordinate_x < 0 && coordinate_y > 0) {
            System.out.println("2");
        } else if (coordinate_x < 0 && coordinate_y < 0) {
            System.out.println("3");
        } else if (coordinate_x > 0 && coordinate_y < 0) {
            System.out.println("4");
        }
    }
}