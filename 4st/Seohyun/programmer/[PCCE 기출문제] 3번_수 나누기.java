import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        
        for(int i=0; number!=0; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}