import java.util.*;
class Solution {
    public String[] solution(String myString) {
        
        String[] strArr = myString.split("x");
       
        ArrayList<String> list = new ArrayList<>();
        
        for(String str : strArr){
            if(!str.isEmpty()){
                list.add(str);
            }
        }

        String[] result =  new String[list.size()];
        list.toArray(result);
        Arrays.sort(result);
        
        
        return result;
    }
}