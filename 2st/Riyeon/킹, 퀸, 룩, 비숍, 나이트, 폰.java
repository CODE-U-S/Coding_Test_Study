import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = { 1, 1, 2, 2, 2, 8};
		for(int i=0; i<6; i++){
		    arr[i] -= sc.nextInt();
		    System.out.print(arr[i] + " ");
		}
	}
}