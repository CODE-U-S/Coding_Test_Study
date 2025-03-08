import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		double sum=0, hakjum=0;
		
		for(int i=0; i<20; i++){
		    st = new StringTokenizer(br.readLine());
		    String object = st.nextToken();
		    double num = Double.parseDouble(st.nextToken());
		    String str = st.nextToken();
		    double jumsu=0;
		    
		    if(!(str.equals("P"))){
        	    switch(str){
        	        case "A+":
        	            jumsu = 4.5;
        	            break;
                    case "A0":
        	            jumsu = 4.0;
        	            break;
        	        case "B+":
        	            jumsu = 3.5;
        	            break;
                    case "B0":
        	            jumsu = 3.0;
        	            break;
        	        case "C+":
        	            jumsu = 2.5;
        	            break;
                    case "C0":
        	            jumsu = 2.0;
        	            break;
                    case "D+":
        	            jumsu = 1.5;
        	            break;
                    case "D0":
        	            jumsu = 1.0;
        	            break;
                    case "F":
        	            jumsu = 0.0;
        	            break;
                    default:
        	            break;
        	    }
        	    sum += jumsu * num;
		        hakjum += jumsu;
		    }
		}
		System.out.printf("%.6f", sum / hakjum);
		br.close();
	}
}