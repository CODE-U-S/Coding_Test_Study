import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = br.readLine();
            if(s.equals("#")) break;

            String[] strArr = s.split(" ");
            for (String str : strArr) {
                StringBuffer sb = new StringBuffer(str);
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
