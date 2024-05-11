import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=l; i<=r; i++){
            String s = String.valueOf(i).replaceAll("0|5", "");
            if(s.equals(""))
                li.add(i);
        }
        if(li.isEmpty())
            li.add(-1);
        return li;
    }
}