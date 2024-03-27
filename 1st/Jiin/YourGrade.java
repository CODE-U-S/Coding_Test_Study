import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		String[] tokenizer;
		double gradeTotal = 0.0;
		double aver = 0.0;
		
		final List<String> grade = Arrays.asList("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F");
		final List<Double> rating = Arrays.asList(4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0);
		
		for(int i = 0; i<20; i++) {
			try {
				input = br.readLine();
				tokenizer = input.split(" ");
				if(!tokenizer[2].equals("P")) {
					gradeTotal += Double.parseDouble(tokenizer[1]);
					aver += Double.parseDouble(tokenizer[1]) * rating.get(grade.indexOf(tokenizer[2]));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.printf("%.6f", aver/gradeTotal);

	}

}
