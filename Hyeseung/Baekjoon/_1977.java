import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1977 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 1; i * i <= N; i++) {
            if (i * i >= M && i * i <= N) {
                min = Math.min(min, i * i);
                sum += i * i;
            }
        }

        System.out.println(sum == 0 ? -1 : sum + "\n" + min);
    }
}
