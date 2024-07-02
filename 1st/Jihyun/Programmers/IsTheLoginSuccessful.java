import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        ArrayList<String> id = new ArrayList<>();
        ArrayList<String> pw = new ArrayList<>();
        
        for(int i = 0; i < db.length; i++) {
            id.add(db[i][0]);
            pw.add(db[i][1]);
        }
        
        for(int i = 0; i < id.size(); i++) {
            if(id_pw[0].equals(id.get(i))) {
                if(id_pw[1].equals(pw.get(i)))
                    return "login";
                else
                    return "wrong pw";
            }                
        }
        
        return "fail";
    }
}

public class IsTheLoginSuccessful {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] a = {"meosseugi", "1234"};
		String[][] b = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		System.out.println(s.solution(a, b));	 // "login"
	}
} 
