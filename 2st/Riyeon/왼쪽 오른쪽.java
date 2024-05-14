import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> li = new ArrayList<>();
        for(String s : str_list)
            li.add(s);

        int l = li.indexOf("l") == -1? li.size() : li.indexOf("l");
        int r = li.indexOf("r") == -1? li.size() : li.indexOf("r");
        if(l==r || l==0)
            li.clear();
        else if(l < r)
            li = li.subList(0, l);
        else{
            if(r==li.size())
                li.clear();
            else
                li = li.subList(r+1, li.size());
        }
        
        return li.toArray(new String[0]);
    }
}