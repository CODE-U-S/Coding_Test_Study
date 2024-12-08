import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        for (String player : participant) 
            hash.put(player, hash.getOrDefault(player, 0) + 1);
        for (String player : completion) 
            hash.put(player, hash.get(player) - 1);
        
        for(int i = 0; i < participant.length; i++)
            if(hash.get(participant[i]) == 1)
                answer = participant[i];
        
        return answer;
    }
}

public class UnsuccessfulRunner {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        Solution s = new Solution();
	    System.out.println(s.solution(participant, completion));	 // "leo"
    }
}
