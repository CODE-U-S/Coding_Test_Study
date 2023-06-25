import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_No_2204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> words = new ArrayList<>();
		ArrayList<String> res = new ArrayList<>();
		while(n != 0) {
			for(int i = 0; i < n; i++)
				words.add(sc.next());
			Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
			res.add(words.get(0));
			words.clear();
			n = sc.nextInt();
		}
		for(int i = 0; i < res.size(); i++)
			System.out.println(res.get(i));
	}
}
