package BaekJoon;
import java.util.Scanner;

public class No_2909 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		double k = sc.nextDouble();
		double pow = Math.pow(10, k);
		double a = c / pow;
		System.out.println((int)((Math.round(a)) * pow));
	}
}