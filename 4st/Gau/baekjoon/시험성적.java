import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
    int Score = sc.nextInt();   
    if(90<=Score) {
        System.out.println("A");
    }
       else if(80<=Score) {
        System.out.println("B");
    } else if(70<=Score) {
        System.out.println("C");
    } else if(60<=Score) {
        System.out.println("D");
    } else {
           System.out.println("F");
       }
    }
}