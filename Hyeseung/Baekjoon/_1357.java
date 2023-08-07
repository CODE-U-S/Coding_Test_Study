import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1357 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int num1 = Integer.parseInt(new StringBuffer().append(str[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuffer().append(str[1]).reverse().toString());
        System.out.println(Integer.parseInt(new StringBuffer().append(num1 + num2).reverse().toString()));

    }
}
