class Solution {
    public int solution(String my_string, String is_prefix) {
        if (is_prefix.length() > my_string.length()) {
            return 0;
        }
        for (int i = 0; i < is_prefix.length(); i++) {
            if (my_string.charAt(i) != is_prefix.charAt(i)) {
                return 0;
            } 
        }
        return 1;
    }
}

class Solution1 {
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