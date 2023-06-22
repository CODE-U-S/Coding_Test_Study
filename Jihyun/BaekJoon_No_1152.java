import java.util.Scanner;

public class BaekJoon_No_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] b = sc.nextLine().split(" ");
		int len = b.length;
		if(b.length > 0 && b[0].isEmpty())
			len--;
		System.out.println(len);
	}
}