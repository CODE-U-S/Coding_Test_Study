import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10988 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();

        int answer = 1;
        int left = 0;
        int right = ch.length - 1;
        while (right >= left) {
            if (ch[left++] != ch[right--])
                answer = 0;
        }

        System.out.println(answer);
    }
}
