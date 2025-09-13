import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int max = 0;
        
        if (A == B && B == C) {
            System.out.print(10000+B*1000);
        }
        else if (A == B || A == C)
            System.out.print(1000+A*100);
        else if (B == C) {
            System.out.print(1000+B*100);
        }
        else if (A > max) {
            max  = A;
	    if ( B > max) max = B;
	    if ( C > max) max = C;
	    System.out.print(max*100);
        }
    }
}