import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10813 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int[] arr = new int[Integer.parseInt(str[0])];
        int M = Integer.parseInt(str[1]);

        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int i1 = Integer.parseInt(s[0]) - 1;
            int j1 = Integer.parseInt(s[1]) - 1;

            int tmp = arr[i1];
            arr[i1] = arr[j1];
            arr[j1] = tmp;

        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
