import java.util.*;
class Solution {
    public List<?> solution(int n, int[] numlist) {  
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }
        return answer;
    }
}
//level 0
//https://school.programmers.co.kr/learn/courses/30/lessons/120905
//정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
