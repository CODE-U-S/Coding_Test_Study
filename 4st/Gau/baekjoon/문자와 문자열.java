import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b=sc.nextInt()-1;
        System.out.println(a.charAt(b));
    }
}
