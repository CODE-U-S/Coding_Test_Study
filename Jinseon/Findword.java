import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();//문자와 index를 저장
        
        for (int i = 0; i < s.length(); i++) {
            char s_char = s.charAt(i);  //쪼개기
            
            if (!map.containsKey(s_char)) answer[i] = -1; //처음인지 확인
            else answer[i] = i - map.get(s_char); //문자가 저장된 최근 위치 가져오기
            
            map.put(s_char, i); //값 저장
        }
        return answer;
    }
}
