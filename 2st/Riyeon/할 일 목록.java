import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> li = new ArrayList<>();
        for(int i=0; i<finished.length; i++){
            if(finished[i] == false)
                li.add(todo_list[i]);
        }
        return li.toArray(new String[0]);
    }
}