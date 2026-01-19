import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(s.nextInt() + s.nextInt());
        }
    }
}