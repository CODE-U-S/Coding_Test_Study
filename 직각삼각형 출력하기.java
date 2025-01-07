import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for (int i = 1; i <= n; i++) {
            // 각 줄마다 i개의 *을 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
        
    }
}