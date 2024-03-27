import java.util.Scanner;

public class _28938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += sc.nextInt();

        System.out.println(sum > 0 ? "Right" : sum == 0 ? "Stay" : "Left");
    }
}