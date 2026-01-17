import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();    
        int b=sc.nextInt();
        if(a>0&&b>0){
            System.out.println(1);
        }else if(a<0&&b<0){
            System.out.println(3);
        }else if(a<0&&b>0){
            System.out.println(2);
        }else if(a>0&&b<0){
            System.out.println(4);
        }
    }
}