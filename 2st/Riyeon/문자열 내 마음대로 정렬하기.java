import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> li = new ArrayList<>();
        Arrays.sort(strings);
        for(int i=0; i<strings.length-1; i++){
            for(int j=i+1; j<strings.length; j++){
                if(strings[i].charAt(n) > strings[j].charAt(n)){
                    String temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }else if(strings[i].charAt(n)==strings[j].charAt(n) && strings[i].compareTo(strings[j])>0){
                    String temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
            }
        }
        
        return strings;
    }
}