package Sojeong.Programmers;

class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        // replaceAll(): 새로운 문자열을 생성하여 반환
        // answer 변수에는 매번 새로운 문자열이 할당되고 기존 문자열이 사라짐
        // 즉, answer에 my_string을 할당해 주어야 함!!
        
        String[] vowel = {"a", "i", "u", "e", "o"};
        
        for(String s : vowel) {
            answer = answer.replaceAll(s, "");
        }
        
        return answer;
    }
}
