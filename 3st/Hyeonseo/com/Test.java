import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean ans = true;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            ans = true;
            String s = input.next();
            loop:
            for (int k = 0; k < s.length(); k++) {
                for (int j = k + 1; j < s.length(); j++) {
                    if (s.charAt(k) != s.charAt(j)) {
                        ans = false;
                    }
                    else if (!ans) {
                        answer++;
                        break loop;
                    }
                }
            }
        }
        System.out.println(n - answer);
        input.close();
    }
}