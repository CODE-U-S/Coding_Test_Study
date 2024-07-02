package Sojeong.Programmers;

class Solution {
    public StringBuilder solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        int answer_length = phone_number.length() - 4;
        
        for(int i = 0; i < answer_length; i++) {
            answer.append("*");
        }
        
        // phone_number의 뒤에서부터 4번째 ~ 끝 인덱스만 잘라서 answer에 붙임
        answer.append(phone_number.substring(answer_length));
        
        return answer;
    }
}
