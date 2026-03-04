import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x"); 
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) { 
                list.add(arr[i]);
            }
        }
        
        Collections.sort(list); 
        
        return list.toArray(new String[0]); 
    }
}