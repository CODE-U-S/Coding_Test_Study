import java.util.*;
class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<26; i++)
            map.put(String.valueOf((char)('A'+i)), i+1);
        
        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int idx=27, pre = 0;
                    
        for(int i=0; i<msg.length(); i++){
            sb.append(msg.charAt(i));
            if(map.containsKey(sb.toString())){
                pre = map.get(sb.toString());
            }else{
                map.put(sb.toString(), idx++);
                answer.add(pre);
                sb = new StringBuilder();
                i--;
            }
        }
        if(sb.length() != 0){
            answer.add(pre);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}