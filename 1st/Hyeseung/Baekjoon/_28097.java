import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _28097 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] str = br.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
            if (i < str.length - 1)
                sum += 8;
        }

        System.out.println((sum / 24) + " " + (sum - (sum / 24 * 24)));
    }
}
