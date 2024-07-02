import java.util.Scanner;

public class _29699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "WelcomeToSMUPC";
        char[] arr = str.toCharArray();

        if(n >= 1 && n<15) {
            System.out.println(arr[n-1]);
        }
        if(n==15) {
            System.out.println(arr[0]);
        }
        if(n>15) {
            if((n%14)==0) {
                System.out.println(arr[13]);
            }
            if((n%14) != 0) {
                System.out.println(arr[(n%14)-1]);
            }
        }
    }
}