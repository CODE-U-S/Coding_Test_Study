class Solution {
    public String solution(int[] food) {
        String answer = "";
        int food_length = 0;
        
        //왼쪽 선수 음식 준비
        for(int i = 0; i < food.length; i++){
            if(food[i]/2 >= 1){
                for(int j = 0; j < food[i]/2; j++){
                    food_length++;
                    answer += String.valueOf(i);
                }//for j
            }//if
        }//for i
        
        //물 준비
        answer += '0';
        
        //오른쪽 선수 음식 준비
        for(int i = food_length - 1; i >= 0; i--){
            answer += answer.charAt(i);
        }
        
        return answer;
    }
}
