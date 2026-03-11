// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}