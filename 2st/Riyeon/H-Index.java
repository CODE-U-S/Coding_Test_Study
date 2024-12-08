class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for(int i=1; i<=citations.length; i++){
            int cnt=0;
            for(int n : citations){
                if(i <= n)
                    cnt++;
            }
            if(cnt >= i){
                answer = i;
                if(cnt == i) break;
            }
        }
        return answer;
    }
}