class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int cnt=1;
        while(cnt != 0){
            answer++;
            cnt = 0;
            for(int n : arr){
                if(answer % n != 0)
                    cnt++;
            }
        }
        return answer;
    }
}