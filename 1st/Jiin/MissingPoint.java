import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int missing_point = 0;
        
        HashMap<String, Integer> missing = new HashMap<String, Integer>(){{
           for(int i = 0; i < name.length; i++)
               put(name[i], yearning[i]);
        }};
        
        for(int i = 0; i < photo.length; i++){
            missing_point = 0;
            for(int j = 0; j < photo[i].length; j++)
                if(missing.get(photo[i][j]) != null)
                    missing_point += missing.get(photo[i][j]);
            
            answer[i] = missing_point;
        }
        
        return answer;
    }
}
