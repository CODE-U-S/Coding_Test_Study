import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<keymap.length;i++){
            for(int j=0; j<keymap[i].length(); j++){
                if(hm.containsKey(keymap[i].charAt(j))){
                    if(hm.get(keymap[i].charAt(j)) > (j+1))
                        hm.put(keymap[i].charAt(j), j+1);
                }else
                    hm.put(keymap[i].charAt(j), j+1);
            }
        }
        
        int[] answer = new int[targets.length];
        for(int i=0; i<targets.length; i++){
            int n=0;
            for(int j=0; j<targets[i].length(); j++){
                Integer m = hm.get(targets[i].charAt(j));
                if(m != null)
                    n += m;
                else{
                    n = -1;
                    break;
                }
            }
            answer[i] = n;
        }
        return answer;
    }
}