import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("R",0); hm.put("T",0);
        hm.put("C",0); hm.put("F",0);
        hm.put("J",0); hm.put("M",0);
        hm.put("A",0); hm.put("N",0);
        for(int i=0; i<survey.length; i++){
            String[] str = survey[i].split("");
            String s = choices[i]<4? str[0] : str[1];
            int n=0;
            if(choices[i]==3||choices[i]==5) n = 1;
            else if(choices[i]==2||choices[i]==6) n=2;
            else if(choices[i]==1||choices[i]==7) n=3;
            hm.put(s, hm.get(s)+n);
        }
        String answer = "";
        answer += hm.get("R") >= hm.get("T")? "R" : "T";
        answer += hm.get("C") >= hm.get("F")? "C" : "F";
        answer += hm.get("J") >= hm.get("M")? "J" : "M";
        answer += hm.get("A") >= hm.get("N")? "A" : "N";
        return answer;
    }
}