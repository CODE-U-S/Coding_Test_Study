import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);

            if (a == 0 && b == 0 && c == 0)
                break;

            if (c - b == b - a)
                System.out.println("AP " + (c + (c - b)));
            else if (c / b == b / a)
                System.out.println("GP " + (c * (c / b)));
        }
    }
}
