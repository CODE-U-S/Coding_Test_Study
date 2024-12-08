import java.util.*;
class Solution {    
    public int solution(String str1, String str2) {
        ArrayList<String> set1 = new ArrayList<>();
        ArrayList<String> set2 = new ArrayList<>();
        ArrayList<String> nset = new ArrayList<>();    // 교집합
        ArrayList<String> uset = new ArrayList<>();    // 합집합
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        for(int i=0; i<str1.length()-1; i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z')
                set1.add(first + "" + second);
        }
        for(int i=0; i<str2.length()-1; i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            if(first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z')
                set2.add(first + "" + second);
        }
        
        Collections.sort(set1);
        Collections.sort(set2);
        
        for(String s : set1){
            if(set2.remove(s))
                nset.add(s);
            uset.add(s);
        }
        for(String s : set2){
            uset.add(s);
        }
        
        double answer = 0;
        if(uset.size() == 0)
            answer = 1;
        else
            answer = (double)nset.size() / (double)uset.size();
        return (int)(answer*65536);
    }
}