import java.util.Scanner;

public class _29163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int odd = 0, even = 0;
        for(int i = 0; i < arr.length; i++) {
            if (sc.nextInt() % 2 == 0) even++;
            else odd++;
        }
        
        System.out.println(even > odd ? "Happy" : "Sad");
    }
}