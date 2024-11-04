class Solution {
    public int[] solution(int start_num, int end_num) {
        // 배열의 크기는 (start_num - end_num + 1)
        int[] answer = new int[start_num - end_num + 1];
        
        // 반복문을 통해 start_num에서 end_num까지 1씩 감소
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num - i;
        }
        
        return answer;
    }
}