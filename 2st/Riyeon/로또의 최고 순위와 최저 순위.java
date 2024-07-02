class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero=0, cnt=0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0) zero++;
            else
                for(int j=0; j<win_nums.length; j++)
                    if(lottos[i] == win_nums[j]){
                        cnt++;
                        break;
                    }
        }
        answer[0] = cnt+zero>1? 7-(cnt+zero) : 6;
        answer[1] = cnt>1? 7-cnt : 6;
        return answer;
    }
}