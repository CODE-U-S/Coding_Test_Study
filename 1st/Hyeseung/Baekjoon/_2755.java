import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2755 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        double sum1 = 0, sum2 = 0;
        double[] score = { 4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0 };
        String[] scoreName = "A+,A0,A-,B+,B0,B-,C+,C0,C-,D+,D0,D-,F".split(",");

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int index = Arrays.asList(scoreName).indexOf(str[2]);
            sum1 += score[index] * Double.parseDouble(str[1]);
            sum2 += Double.parseDouble(str[1]);
        }

        System.out.printf("%.2f", sum1 / sum2);
    }
}
