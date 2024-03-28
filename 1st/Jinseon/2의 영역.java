class Solution {
    public int[] solution(int[] arr) {
        int start = -1, end = -1;
        for(int i = 0 ;i < arr.length; i++){
            if(arr[i] == 2 && start == -1){
                start = i; //초기값 설정
                end = i;
            }
            if(end < i && arr[i] == 2){
                end = i; //end update
            }
        }
        
        int[] answer;
        
        if(start == -1) {
            answer = new int[]{-1}; 
        } else {
            answer = new int[end - start + 1];
            for(int i = 0; i < answer.length; i++){
                answer[i] = arr[start + i];
            }
        }
        return answer;
    }
}
