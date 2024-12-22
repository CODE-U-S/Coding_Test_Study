import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer=-1;
        char[] bef=before.toCharArray();    
        char[] aft=after.toCharArray();   
        
        Arrays.sort(bef);                 
        Arrays.sort(aft);                 
        
        if(Arrays.equals(bef, aft)) {   
                answer=1;            
            } 
        else {                        
                answer=0;                   
            }
        return answer;
    }
}
