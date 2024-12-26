import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int A = sc.nextInt();
        
        if (A >= 90) {
            System.out.print("A");
        } else if (A >= 80) {
            System.out.print("B");
        } else if (A >= 70) {
            System.out.print("C");
        }else if (A >= 60) {
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}