import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "odd";
        if(n % 2 == 0) {
            a = "even";
        }
        System.out.print(n + " is " + a);
    }
}