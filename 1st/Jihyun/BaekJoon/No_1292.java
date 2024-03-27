package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No_1292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		ArrayList<Integer> n = new ArrayList<>();
		int sum = 0;
		for(int i = 1; i <= b; i++)
			for(int j = 1; j <= i; j++)
				n.add(i);
		
		for(int i = a - 1; i < b; i++)
			sum += n.get(i);
		
		System.out.println(sum);
	}
}