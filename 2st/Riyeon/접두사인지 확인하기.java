class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i=1; i<my_string.length(); i++){
            if(my_string.substring(0, i).equals(is_prefix))
                answer = 1;
        }
        return answer;
    }
}