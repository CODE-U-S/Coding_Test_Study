import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[1000];
        int count = 0;
        
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if (A == 0 && B == 0) 
                break;
            
            sum[count] = A + B;
            count++;
        }
        
        for (int i = 0; i < count; i++)
            System.out.println(sum[i]);
    }
}