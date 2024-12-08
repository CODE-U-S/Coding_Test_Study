import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        
        for(int i=1; i<words.length; i++){
            int len = words[i-1].length();
            String ed = words[i-1].substring(len-1, len);
            String st = words[i].substring(0, 1);
            
            if(!ed.equals(st) || list.contains(words[i])){
                answer[0] = i%n+1;
                answer[1] = (i+1)%n == 0 ? (i+1)/n : (i+1)/n+1;
                break;
            }else
                list.add(words[i]);
        }
        return answer;
    }
}