class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];  // 가장 큰 값 초기화
        int maxIndex = 0;    // 가장 큰 값의 인덱스 초기화
        
        for(int i = 1; i < array.length; i++) { 
            if(array[i] > max) {
                max = array[i];      // 최대값 갱신
                maxIndex = i;        // 최대값의 인덱스 갱신
            }
        }
        
        answer[0] = max;       // 최대값
        answer[1] = maxIndex;  // 최대값의 인덱스
        return answer;
    }
}
//level 0
//https://school.programmers.co.kr/learn/courses/30/lessons/120899
//  정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
