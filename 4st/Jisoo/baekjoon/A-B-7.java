import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        for(int i = 1;i < length+1;i++){
            int num=sc.nextInt();
            int num2=sc.nextInt();
            System.out.print("Case #");
            System.out.print(i);
            System.out.print(": ");
            System.out.println(num+num2);

        }
    }
}
