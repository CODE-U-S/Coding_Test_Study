import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in) ;
        int T = sc.nextInt();
        int A,B = 1;
        int sum[] = new int[T];
        for (int i= 0;i<sum.length;i++){
            A = sc.nextInt();
            B = sc.nextInt();
            sum[i]=A+B;
        }
        for(int j=0;j<sum.length;j++)
            System.out.println(sum[j]);
    }
}