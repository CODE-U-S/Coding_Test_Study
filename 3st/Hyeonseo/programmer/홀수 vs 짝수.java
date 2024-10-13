class Solution {
    public int solution(int[] num_list) {
        int add,even;
        int answer;
        add = even = 0;
        for(int i = 0; i < num_list.length; i++){
            if (i % 2 == 0){
                add += num_list[i];
            }
            else if (i % 2 == 1){
                even += num_list[i];
            }

         }
        answer = add;
        if (answer < even){
            answer = even;
        }
        return answer;
    }
}
//https://school.programmers.co.kr/learn/courses/30/lessons/181887
//정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
//level 0