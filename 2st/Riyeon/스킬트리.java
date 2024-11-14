import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<skill.length(); i++)
            map.put(skill.charAt(i), i);
        
        for(String s : skill_trees){
            int cnt=0;
            boolean b = true;
            for(char c : s.toCharArray()){
                Integer num = map.get(c);
                if(num != null){
                    if(cnt < num){
                        b = false;
                        break;
                    }else cnt++;
                }
            }
            if(b) answer++;
        }
        return answer;
    }
}