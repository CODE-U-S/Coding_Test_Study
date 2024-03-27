import java.util.Scanner;

public class _30676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int color = sc.nextInt();

        if(color >= 620) System.out.println("Red");
        else if (color >= 590) System.out.println("Orange");
        else if (color >= 570) System.out.println("Yellow");
        else if (color >= 495) System.out.println("Green");
        else if (color >= 450) System.out.println("Blue");
        else if (color >= 425) System.out.println("Indigo");
        else System.out.println("Violet");
    }
}