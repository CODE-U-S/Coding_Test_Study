import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		boolean[][] paper = new boolean[100][100];
		
		for(int i=0; i<n; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    for(int j=x; j<x+10; j++){
		        for(int k=y; k<y+10; k++){
		            if(!paper[j][k]){
		                paper[j][k] = true;
		                cnt++;
		            }
		        }
		    }
		}
		
		System.out.println(cnt);
	}
}