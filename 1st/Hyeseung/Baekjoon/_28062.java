import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class _28062 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);
        int sum = 0, odd = 0;
        for (int i = N - 1; i >= 0; i--) {
            if ((arr[i] & 1) == 1) {
                if (odd != 0) {
                    sum += odd + arr[i];
                    odd = 0;
                } else
                    odd = arr[i];
            } else
                sum += arr[i];
        }

        System.out.println(sum);
    }
}
