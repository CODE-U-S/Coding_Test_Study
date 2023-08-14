class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] knight_power = new int[number];
        for(int i = 1; i <= number; i++){
            for(int j = 1; j * j <= i; j++){
                if(j*j == i) knight_power[i-1]++;
                else if(i % j == 0) knight_power[i-1] += 2;
            }//inner for
        }//outer for
        
        for(int k=0; k < number; k++){
            if(knight_power[k] > limit) answer += power;
            else answer += knight_power[k];
        }
        return answer;
    }
}
