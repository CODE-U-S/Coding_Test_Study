package day_230903;

import java.util.Scanner;

public class bird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 0, n = 0;
		
		while(num > 0) {
			i++;
			if(num < i) {
				i = 1;
			}
			num -= i;
			n++;
		}
		System.out.println(n);
	}

}
