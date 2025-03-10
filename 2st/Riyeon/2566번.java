import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];
		int max=-1, x=0, y=0;
		
		for(int i=0; i<9; i++){
		    for(int j=0; j<9; j++){
		        arr[i][j] = sc.nextInt();
		        if(arr[i][j] > max){
		            max = arr[i][j];
		            x = i + 1;
		            y = j + 1;
		        }
		    }
		}
		
		System.out.println(max);
		System.out.print(x + " " + y);
	}
}