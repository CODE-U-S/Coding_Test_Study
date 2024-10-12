class Solution {
    public int solution(int[] num) {
        int answer = 0;
        
        int count = 0;
        for(int i = 0; i < num.length; i++) {
            for(int j = i+1; j < num.length; j++) {
                for(int k = j+1; k < num.length; k++) {
                    int sum = num[i] + num[j] + num[k];
                    for(int a = 1; a < sum+1; a++) {
                        if(sum % a == 0) {
                            count++;
                        }
                    } 
                    if(count == 2) {
                        answer++;
                    }
                    count = 0;
                }
            }
        }
        return answer;
    }
}
//https://school.programmers.co.kr/learn/courses/30/lessons/12977
//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
//level 1