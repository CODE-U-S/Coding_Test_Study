import java.util.Scanner;

public class BaekJoon_No_2010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		for(int i = 0; i < n; i++) {
			sum--;
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
}
