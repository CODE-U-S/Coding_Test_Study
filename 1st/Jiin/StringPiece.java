class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int check = 0;
        
        for(int i = 0; i < my_string.length(); i++){
            if(target.charAt(check) == my_string.charAt(i))
                check++;
            if(check == target.length()){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}
