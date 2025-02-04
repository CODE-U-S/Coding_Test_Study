class Solution {
    public int[] solution(int[] num_list) {
        int ecnt=0;
        int ocnt=0;
        int[] answer = new int[2];
        for(int i =0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                ecnt++;
            }
            else if(num_list[i]%2==1){
                ocnt++;
            }
        }
        answer[0] = ecnt;
        answer[1] = ocnt;
        
        return answer;
    }
}