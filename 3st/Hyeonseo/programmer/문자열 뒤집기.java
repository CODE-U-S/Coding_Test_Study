class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str[] = my_string.split("");
        for(int i = str.length-1; i >= 0; i--) {
            answer += str[i];
        }
        return answer;
    }
}
//https://school.programmers.co.kr/learn/courses/30/lessons/120822
//level 0
//문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.