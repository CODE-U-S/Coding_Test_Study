import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(90<=num&&num<=100){
            System.out.print("A");
        }
        else if(80<=num&&num<=89){
            System.out.print("B");
        }
        else if(70<=num&&num<=79){
            System.out.print("C");
        }
        else if(60<=num&&num<=69){
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
    }
}