import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res=0;
        if(1<=a && a<=10000) {
            for (int i = 0; i <= a; i++) {
                res += i;
            }
            System.out.print(res);
        }
    }
}