import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int a[] = new int[n];
		for(int i=0; i<n; i++){
		    a[i] = i+1;
		}
		
		n = Integer.parseInt(st.nextToken());
		for(int i=0; i<n; i++){
		    StringTokenizer st2 = new StringTokenizer(br.readLine());
		    int s = Integer.parseInt(st2.nextToken()) - 1;
		    int e = Integer.parseInt(st2.nextToken()) - 1;
		    
		    for(int j=s; j<e; j++){
		        int sub = a[j];
		        a[j] = a[e];
		        a[e] = sub;
		        e--;
		    }
		}
		
		for(int i : a){
		    System.out.print(i + " ");
		}
	}
}