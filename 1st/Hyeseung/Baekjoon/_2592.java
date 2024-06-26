import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2592 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1001];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
            arr[n]++;
        }

        int idx = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println((sum / 10) + "\n" + idx);
    }
}
