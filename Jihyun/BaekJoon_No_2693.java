import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon_No_2693 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = 10;
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> res = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < size; j++)
				a.add(sc.nextInt());
			Collections.sort(a);
			res.add(a.get(size - 3));
			a.clear();
		}
		
		for(int i = 0; i < n; i++)
			System.out.println(res.get(i));
	}
}
