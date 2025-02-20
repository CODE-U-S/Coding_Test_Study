import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		HashMap<String, Integer> map = new HashMap<>();
		for(String s : str.split("")){
		    s = s.toUpperCase();
		    int n = 1;
		    if(map.containsKey(s)){
		        n = map.get(s) + 1;
		    }
		    map.put(s, n);
		}
		
		String result = "";
		int re = 0;
		boolean b = false;
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
		    String s = it.next();
		    int num = map.get(s);
		    if(re < num){
		        result = s;
		        re = num;
		        b = false;
		    }else if(re == num){
		        b = true;
		    }
		}
		
		if(b){
		    System.out.println("?");
		}else{
		    System.out.println(result);
		}
	}
}