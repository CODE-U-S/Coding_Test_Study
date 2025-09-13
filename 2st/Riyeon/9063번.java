import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    int x, y, x_max=0, x_min=0, y_max=0, y_min=0;
	    for(int i=0; i<n; i++){
	        x = sc.nextInt();
	        y = sc.nextInt();
	        
	        if(x_max == 0){
	            x_max = x;
	            x_min = x;
	            y_max = y;
	            y_min = y;
	        }else{
	            x_max = Math.max(x_max, x);
	            x_min = Math.min(x_min, x);
	            y_max = Math.max(y_max, y);
	            y_min = Math.min(y_min, y);
	        }
	    }
	    
	    System.out.println((x_max - x_min) * (y_max - y_min));
	}
}