import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_No_2711 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		StringBuilder[] a = new StringBuilder[t];
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			sb = new StringBuilder(sc.next());
			a[i] = sb.deleteCharAt(n - 1);
		}
		
		for(int i = 0; i < t; i++)
			System.out.println(a[i]);
	}

}
