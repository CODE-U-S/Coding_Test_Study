import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> li = new ArrayList<>();
        
        if(cacheSize == 0)
            return cities.length*5;
        
        for(String str : cities){
            str = str.toLowerCase();
            if(li.contains(str)){
                answer -= 4;
                li.remove(str);
            }else if(li.size() >= cacheSize)
                li.remove(0);
            li.add(str);
            answer += 5;
            
        }
        return answer;
    }
}