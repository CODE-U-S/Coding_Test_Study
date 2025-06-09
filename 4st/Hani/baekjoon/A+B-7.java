import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
	int sum[] = new int[t];

    for(int i = 0; i < t; i++) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		sum[i] = A + B;
	}
	for (int i = 0; i < t; i++)
        	System.out.println("Case #" + (i+1) + ": " + sum[i]);
    }
}