import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _28074 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] ch = { 'M', 'O', 'B', 'I', 'S' };
        for (int i = 0; i < ch.length; i++) {
            if (!str.contains(String.valueOf(ch[i]))) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }
}
