package BaekJoon;
import java.util.Scanner;

public class No_2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] words = str.split("-");
		for(int i = 0; i < words.length; i++)
			System.out.print(words[i].charAt(0));
	}
}