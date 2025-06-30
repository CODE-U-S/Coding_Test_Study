class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        for (int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0)
                cnt++;
        }
        int[] answer = new int[cnt];
        int idx = 0;
        for (int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[idx] += numlist[i];
                    idx++;
            }
        }
        return answer;
    }
}