class Solution {
    public int[] solution(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int odd=1;
        for(int i=0;i<cnt;i++){
            answer[i]=odd;
            odd+=2;
        }
        return answer;
    }
}