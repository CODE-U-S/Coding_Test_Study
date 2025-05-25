import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();

		int cook = sc.nextInt();

		int tot = (hour*60) + min + cook;

		int cookhour = (tot / 60) % 24;
		int cookmin = tot % 60;

		System.out.println(cookhour + " " + cookmin);
	}
}