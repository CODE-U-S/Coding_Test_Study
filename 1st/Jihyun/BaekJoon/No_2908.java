package BaekJoon;
import java.util.Scanner;

public class No_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {sc.nextInt(), sc.nextInt()};
		int res[] = new int[2];
		for(int i = 0; i < 2; i++) {
			res[i] = (a[i] % 10 * 100) + (a[i] - (a[i] / 100 * 100 + a[i] % 10)) + (a[i] / 100);
		}
		System.out.println((res[0] > res[1])? res[0] : res[1]);
	}
}
