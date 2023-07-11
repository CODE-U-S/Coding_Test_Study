import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_No_10103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 100, sa = 100;
		int n = sc.nextInt();
		int ch_s, sa_s;
		for(int i = 0; i < n; i++) {
			ch_s = sc.nextInt();
			sa_s = sc.nextInt();
			if(ch_s > sa_s)
				sa -= ch_s;
			else if(ch_s < sa_s)
				ch -= sa_s;
			else
				continue;
		}
		System.out.println(ch + "\n" + sa);
	}
}
