import java.util.Scanner;

public class _28691 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch(sc.next().charAt(0)) {
            case 'M': System.out.println("MatKor"); break;
            case 'W': System.out.println("WiCys"); break;
            case 'C': System.out.println("CyKor"); break;
            case 'A': System.out.println("AlKor"); break;
            case '$': System.out.println("$clear"); break;
        }
    }
}