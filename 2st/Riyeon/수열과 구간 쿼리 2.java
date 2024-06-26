class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0; i< queries.length; i++){
            for(int j = queries[i][0]; j<=queries[i][1]; j++){
                if(queries[i][2] < arr[j]){
                    if(answer[i]!=0 && arr[j] < answer[i])
                        answer[i] = arr[j];
                    else if(answer[i]==0)
                        answer[i] = arr[j];
                }
            }
            if(answer[i] == 0)
                answer[i] = -1;
        }
        return answer;
    }
}