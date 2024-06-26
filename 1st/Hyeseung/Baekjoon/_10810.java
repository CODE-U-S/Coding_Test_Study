import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10810 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(str[0])];
        int M = Integer.parseInt(str[1]);

        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");

            int i1 = Integer.parseInt(s[0]) - 1;
            int j1 = Integer.parseInt(s[1]);
            int k1 = Integer.parseInt(s[2]);

            for (int j = i1; j < j1; j++) {
                arr[j] = k1;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
