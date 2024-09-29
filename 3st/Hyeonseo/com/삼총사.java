class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < number.length; i++) {
            for(int j = i+1; j < number.length; j++) {
                for(int k = j+1; k < number.length; k++) {
                    sum += number[i] + number[j] + number[k];
                    if(sum == 0) {
                        answer++;
                    }
                    sum = 0;
                }
            }
        }
        return answer;
    }
}
//https://school.programmers.co.kr/learn/courses/30/lessons/131705
//한국중학교에 다니는 학생들은 각자 정수 번호를 갖고 있습니다. 이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다. 예를 들어, 5명의 학생이 있고, 각각의 정수 번호가 순서대로 -2, 3, 0, 2, -5일 때, 첫 번째, 세 번째, 네 번째 학생의 정수 번호를 더하면 0이므로 세 학생은 삼총사입니다. 또한, 두 번째, 네 번째, 다섯 번째 학생의 정수 번호를 더해도 0이므로 세 학생도 삼총사입니다. 따라서 이 경우 한국중학교에서는 두 가지 방법으로 삼총사를 만들 수 있습니다.

//한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.
//level 1