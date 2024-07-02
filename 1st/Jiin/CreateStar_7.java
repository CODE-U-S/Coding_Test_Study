import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        //중앙 포함 윗부분
        for(int i = 1; i <= height; i++) {
        	for(int j = height - i; j > 0; j--)
        		System.out.print(" ");
        	for(int k = 1; k <= i*2 - 1; k++)
        		System.out.print("*");
        	System.out.println();
        }

        //중앙 아래 부분
        for(int i = height - 1; i >= 0; i--) {
        	for(int j = height - i; j > 0; j--)
        		System.out.print(" ");
        	for(int k = 1; k <= i*2 - 1; k++)
        		System.out.print("*");
        	System.out.println();
        }

    }
}
