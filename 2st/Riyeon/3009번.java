import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a[] = new int[6];
	    for(int i=0; i<6; i++){
	        a[i]= sc.nextInt();
	    }
	    
	    int x, y;
	    if(a[0] == a[2]){
	        x = a[4];
	    }else if(a[0] == a[4]){
	        x = a[2];
	    }else{
	        x = a[0];
	    }
	    
	    if(a[1] == a[3]){
	        y = a[5];
	    }else if(a[1] == a[5]){
	        y = a[3];
	    }else{
	        y = a[1];
	    }
	    
	    System.out.println(x + " " + y);
	}
}