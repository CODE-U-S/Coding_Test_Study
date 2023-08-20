package Sojeong.Programmers;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            int index = s.substring(0, i).lastIndexOf(s.charAt(i));
            /*
                ex (s = "banana", i = 3 (4번째 반복))
                index = "ban"의 a가 포함된 가장 마지막 인덱스 => 1번째 인덱스
                
                answer[3] = 3 - 1 => 2
                
            */
            
            if(index != -1) { // index가 앞에 이미 나온 경우
                answer[i] = i - index; // 
            } else { // index가 아직 나오지 않은 경우
                answer[i] = index; // -1
            }
        }
        
        return answer;
    }
}
