class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        for(int i=0; i<arr.length; i++){
            if(i > 0) answer += " ";
            String str = arr[i];
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(j%2==0)
                    answer += Character.toUpperCase(ch);
                else
                    answer += Character.toLowerCase(ch);
            }
        }
        return answer;
    }
}