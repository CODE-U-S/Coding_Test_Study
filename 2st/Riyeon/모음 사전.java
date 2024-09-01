import java.util.*;
class Solution {
    static List<String> li = new ArrayList<>();
    static String[] wds = {"A", "E", "I", "O", "U"};
    
    public static int solution(String word) {
        int answer = 0;
        dfs("", 0);
        for(int i=0; i<li.size(); i++){
            if(word.equals(li.get(i))){
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void dfs(String str, int len){
        li.add(str);
        if(len == wds.length) return;
        for(int i=0; i<wds.length; i++)
            dfs(str + wds[i], len+1);
    }
}