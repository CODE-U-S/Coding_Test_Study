class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        String[] temp = new String[my_string.length()];
        temp[0] = String.valueOf(my_string.charAt(0));
        
        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i-1] + my_string.charAt(i);
        }
        
        for (int i = 1; i < temp.length; i++) {
            if (temp[i].equals(is_prefix)) 
                answer = 1;
        }
        return answer;
    }
}