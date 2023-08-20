import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BaekJoon_No_1864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<>();
		String inp = "";
		String[] s;
		int sum = 0;
		h.put("-", 0);
		h.put("\\", 1);
		h.put("(", 2);
		h.put("@", 3);
		h.put("?", 4);
		h.put(">", 5);
		h.put("&", 6);
		h.put("%", 7);
		h.put("/", -1);

		while(true) {
			sum = 0;
			inp = sc.next();
			if(inp.equals("#"))
				break;
			s = inp.split("");
			for(int i = 0; i < s.length; i++) {
				sum += h.get(s[i]) * Math.pow(8, s.length - (i + 1));
			}
			res.add(sum);
		}

		for(int i = 0; i < res.size(); i++) 
			System.out.println(res.get(i));
	}
}
