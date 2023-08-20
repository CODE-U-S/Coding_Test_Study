import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaekJoon_No_1357 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> str = new ArrayList<>();
		int sum = 0;

		str.add(st.nextToken());
		str.add(st.nextToken());

		for(int i = 0; i < str.size(); i++)
			sum += Integer.parseInt(new StringBuffer(str.get(i)).reverse().toString());
		
		System.out.println(Integer.parseInt(new StringBuffer(Integer.toString(sum)).reverse().toString()));
	}
}
