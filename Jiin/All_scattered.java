
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class All_scattered{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 1; i <= testCase; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int base = Integer.parseInt(st.nextToken());
			int power = Integer.parseInt(st.nextToken());
			long task=base;
			for(int j = 1; j < power; j++) {
				task = (task * base)%10;
			}
			if(task%10 == 0)
				bw.write("10\n");
			else
				bw.write(task%10+"\n");
		}
		bw.close();
		br.close();
	}

}
