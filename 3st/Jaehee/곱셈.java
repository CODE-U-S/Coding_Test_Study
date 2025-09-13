import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		
		int b3= (int)Math.floor(b*0.01+1e-9);  
		int b2= (int)Math.floor(((b*0.01+1e-9) - Math.floor(b*0.01+1e-9))*10);
		int b1= (int)Math.floor(((b*0.1+1e-9) - Math.floor(b*0.1+1e-9))*10);

		System.out.println(a*b1);
		System.out.println(a*b2);
		System.out.println(a*b3);
		System.out.println(a*b1+a*b2*10+a*b3*100);
		
		sc.close();
	}

}