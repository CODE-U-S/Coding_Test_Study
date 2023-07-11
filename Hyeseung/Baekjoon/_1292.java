import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class _1292 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0, sum = 0;

        for (int i = 1; i <= arr[1]; i++)
            for (int j = 1; j <= i; j++) {
                count++;
                if (arr[0] <= count && count <= arr[1])
                    sum += i;
            }

        System.out.println(sum);
    }
}
