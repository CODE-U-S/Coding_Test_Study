import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		
		for(int i=0; i<n; i++){
		    String str = sc.next(), before = "";
		    boolean b = true;
		    Set<String> set = new HashSet<>();
		    
		    for(String s : str.split("")){
		        if(!before.equals(s)){
		            if(set.contains(s)){
		                b = false;
		                break;
		            }else{
		                set.add(s);
		                before = s;
		            }
		        }
		    }
		    
		    if(b) count++;
		}
		
		System.out.println(count);
	}
}