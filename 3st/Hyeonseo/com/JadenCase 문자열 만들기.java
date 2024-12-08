import java.util.*;
class Solution {
    public String solution(String s) {
       StringBuilder sb = new StringBuilder();
        int size = s.length();
        boolean first = true;
        for(int i = 0; i < size; i++){
            char cur = s.charAt(i);
            // 이번 문자가 공백이라면?
            if(cur == ' '){
                sb.append(' ');
                first = true;
                continue;
            }
            // JadenCase 첫 문자 X
            if(!first){
                sb.append(Character.toString(cur).toLowerCase());
                continue;
            }
            // JandenCase 첫 문자 O
            sb.append(Character.toString(cur).toUpperCase());
            first = false;
        }
        return sb.toString();
    }
}
//https://school.programmers.co.kr/learn/courses/30/lessons/12951#qna
//JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
// 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
//level 2