import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _28113 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[1]);
        int B = Integer.parseInt(str[2]);

        if (A > B)
            System.out.println("Subway");
        else if (A < B)
            System.out.println("Bus");
        else
            System.out.println("Anything");
    }
}
