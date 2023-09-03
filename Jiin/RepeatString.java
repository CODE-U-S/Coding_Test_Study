import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RepeatString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = Integer.parseInt(br.readLine()), repeatNum;
		for(int i = 0; i < testcase; i++) {
			String str = br.readLine(), result="";
			String[] tmp = str.split(" ");
			str = tmp[1];
			repeatNum = Integer.parseInt(tmp[0]);
			for(int j = 0; j < repeatNum * str.length(); j++) {
				result += str.charAt(j/repeatNum);
			}
			bw.write(result + "\n");
			bw.flush();
		}
		
	}

}
