import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> a = new ArrayList<>();
        for(int i = 0; i < names.length; i+=5) 
            a.add(names[i]);
        
        return a.toArray(new String[a.size()]);
    }
}

public class FivePeopleEach {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] a = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		System.out.println(Arrays.toString(s.solution(a)));	 // ["nami", "vex"]
	}
} 